package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void main(String[] args) throws IOException {


        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server started!!!");
            while (true) {
                Socket socet = serverSocket.accept();
                Handler handle = new Handler(socet);
                handle.start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage(e.getMessage());
        }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Connection connection : connectionMap.values()) {
                connection.send(message);
            }


        } catch (IOException e) {
            ConsoleHelper.writeMessage("Cant send massage!!!");
        }
    }


    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String userName = null;
            ConsoleHelper.writeMessage("Connect new wierd :" + socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с серевером");

            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
                ConsoleHelper.writeMessage("Соединение закрыто.");


            }
        }

            private void serverMainLoop (Connection connection, String userName) throws
            IOException, ClassNotFoundException {
                while (true) {
                    Message newMessage = connection.receive();
                    if (newMessage.getType() == MessageType.TEXT) {
                        Message messageText = new Message(MessageType.TEXT, userName + ": " + newMessage.getData());
                        sendBroadcastMessage(messageText);
                    } else ConsoleHelper.writeMessage("Exception !!!!!!!!!!!!!!!!!!");
                }
            }


            private void sendListOfUsers (Connection connection, String userName) throws IOException {
                for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                    if (!entry.getKey().equals(userName)) {
                        Message message = new Message(MessageType.USER_ADDED, entry.getKey());
                        connection.send(message);
                    }
                }


            }

            private String serverHandshake (Connection connection) throws IOException, ClassNotFoundException {
                while (true) {
                    //Отправляем сообщение с запросом имени
                    connection.send(new Message(MessageType.NAME_REQUEST));
                    //Получаем ответ
                    Message answer = connection.receive();
                    if (answer.getType() == MessageType.USER_NAME) {               //Если ответ пришел с именем пользователя
                        if (!answer.getData().isEmpty()) {                         //Если ответ пришел не пустым
                            if (!connectionMap.containsKey(answer.getData()))      //Если этого имени нет в карте
                            {
                                connectionMap.put(answer.getData(), connection);
                                connection.send(new Message(MessageType.NAME_ACCEPTED));
                                return answer.getData();
                            }
                        }
                    }
                }
            }
        }
    }




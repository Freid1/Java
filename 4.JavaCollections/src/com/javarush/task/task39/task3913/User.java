package com.javarush.task.task39.task3913;

import java.util.Date;

public class User {

    private String ip;
    private String userName;
    private Date date;
    private String event;
    private String status;

    public User(String ip, String userName, Date date, String event, String status) {
        this.ip = ip;
        this.userName = userName;
        this.date = date;
        this.event = event;
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public String getUserName() {
        return userName;
    }

    public Date getDate() {
        return date;
    }

    public String getEvent() {
        return event;
    }

    public String getStatus() {
        return status;
    }
}
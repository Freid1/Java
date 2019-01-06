package training;

public class DinamicStructury {
    static Node heade;
    static Node start;
    static Node tail;
    static Node book;

    public static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next = next;
this.prev=prev;
        }
    }

    public static void addNewNode(int data) {
if(book==null){
    book=new Node(data,null,null);
    tail=book;
    heade=book;
    start=heade;

}else{
    book=new Node(data,tail,null);
    tail=book;
    heade.prev=book;
    heade=book;


}
    }

    public static void readeNodeAll(Node book){
        if(book!=null) {System.out.println(book.value);
        readeNodeAll(book.next);
        }
    }





    public static void main(String[] args) {
        addNewNode(5);
        addNewNode(10);
        addNewNode(15);
        readeNodeAll(book);

    }


}

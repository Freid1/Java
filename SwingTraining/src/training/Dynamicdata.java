package training;

import java.util.Arrays;

public class Dynamicdata {
    public static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {

            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node iterationNode = new Node(1, null);
        for (int i = 0; i < 10; i++) {
            iterationNode = new Node(i, iterationNode);
        }
        System.out.println(toStringIter(iterationNode));
        Node novi = recNode(1, 2, 3, 4, 5, 6);
        System.out.println(toStringIter(novi));
        recToString(novi);


    }

    public static Node recNode(int... value) {
        if (value.length == 0) {
            return null;
        } else {
            return new Node(value[0], recNode(Arrays.copyOfRange(value, 1, value.length)));
        }
    }

    public static void recToString(Node vivod) {
        if (vivod.next == null) {
            System.out.println(vivod.value + "*");
        } else {
            System.out.print(vivod.value + "->");
            recToString(vivod.next);
        }
    }

    public static String toStringIter(Node iter) {
        String result = "";
        while (iter != null) {
            result += iter.value + "->";
            iter = iter.next;

        }
        return result + "*";
    }

    public static void merge(Node a, Node b) {


    }

}





package main;

public class AddLast {
    public static Node head;
    public static Node tail;

    public void addLast(int data ){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(STR."\{temp.data}->");
            temp = temp.next;
        }
        System.out.println(" Null");
    }

    public static class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

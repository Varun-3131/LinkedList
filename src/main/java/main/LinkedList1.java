package main;

public class LinkedList1 {
    public static Node head;
    public static Node tail;
    public static int size;

    //To add element at head of the list...
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;                       //To get the size of the list...
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //To add element in the middle of the list...
    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //To add elements at the tail of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //To remove first element in LinkedList

    public int removeFirst() {
        if (size == 0) {
            System.out.println("UnderFlow");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //To remove last element in linkedlist

    public int removeLast() {
        if (size == 0) {
            System.out.println("List Is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //To print a list...
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

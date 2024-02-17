package main;

public class Main {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1(); //Making of object...
        ll.addFirst(5);              //Calling of methods...
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.size);

    }
}

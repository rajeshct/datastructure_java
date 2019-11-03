package com.remember.password;

public class LinkedListOperation {

    public static void main(String args[]) {
        Node head = new Node(1, null);
        createList(head);
        head = reverseList(head);
        printList(head);
    }

    private static Node reverseList(Node head) {
        Node current = head;
        Node previous = null;
        Node next;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    private static void createList(Node head) {
        Node current=head;
        for(int i=2;i<20;i++){
            current.next =new Node();
            current=current.next;
            current.value=i;
        }
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}


class Node {
    public int value;
    Node next;

    Node() {
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

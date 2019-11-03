package com.remember.password;

public class CreateLinkedList {

    public static void main(String args[]) {
        Node head = new Node(1, new Node());
        createList(head);
        printList(head);
    }

    private static void createList(Node head) {
        Node current = head.next;
        for (int i = 2; i < 20; i++) {
            current.value = i;
            current.next = new Node();
            current = current.next;
        }
        current.value = 20;
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

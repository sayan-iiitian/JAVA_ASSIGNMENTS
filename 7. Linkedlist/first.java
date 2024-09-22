// 1. Check if a Key is Present in a Linked List

// Problem: Given a linked list and a key X, check if X is present in the linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class first {
    public static boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int key = 14;
        if (search(head, key)) {
            System.out.println("Yes, " + key + " is present in the list.");
        } else {
            System.out.println("No, " + key + " is not present in the list.");
        }
    }
}

// 2. Insert a Node at a Given Position in a Linked List

// Problem: Insert a node at a given position in the linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class second {
    public static void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The previous node cannot be null.");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);

        head.next = second;
        second.next = third;

        System.out.println("Original list:");
        printList(head);

        insertAfter(second, 3);
        System.out.println("After inserting 3:");
        printList(head);
    }
}

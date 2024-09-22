// 3. Delete Duplicates from a Sorted Linked List

// Problem: Given the head of a sorted linked list, delete all duplicates such that each element appears only once.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class third {
    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
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
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicates(head);
        System.out.println("List after removing duplicates:");
        printList(head);
    }
}

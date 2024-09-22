// 4. Check if a Linked List is a Palindrome

// Problem: Given the head of a singly linked list, return true if it is a palindrome, and false otherwise.

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class fourth {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;

        // Push all elements to stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Traverse list again and compare with stack
        current = head;
        while (current != null) {
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}

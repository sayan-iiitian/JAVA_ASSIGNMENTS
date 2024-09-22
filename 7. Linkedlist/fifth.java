// 5. Sum of Two Numbers Represented by Linked Lists

// Problem: Given two numbers represented by two linked lists, return the sum list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class fifth {
    
    // Function to add two numbers represented by linked lists
    public static Node addTwoNumbers(Node l1, Node l2) {
        // Reverse both linked lists
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        // Add the reversed linked lists
        Node result = addReversedLists(l1, l2);
        
        // Reverse the result to get the final sum in correct order
        return reverseList(result);
    }

    // Helper function to reverse a linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    // Helper function to add two reversed linked lists
    public static Node addReversedLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node p = l1, q = l2, current = dummy;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Representing number 563 as 5 -> 6 -> 3
        Node list1 = new Node(5);
        list1.next = new Node(6);
        list1.next.next = new Node(3);

        // Representing number 842 as 8 -> 4 -> 2
        Node list2 = new Node(8);
        list2.next = new Node(4);
        list2.next.next = new Node(2);

        // Adding the two numbers
        Node result = addTwoNumbers(list1, list2);
        
        // Printing the result
        System.out.println("Sum list:");
        printList(result);
    }
}

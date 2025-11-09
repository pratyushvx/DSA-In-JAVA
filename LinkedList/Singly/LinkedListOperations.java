public class LinkedListOperations {

    // Node definition (like ListNode in LeetCode)
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 1. Insert at beginning
    public static Node insertAtBeginning(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    // 2. Insert at end
    public static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // 3. Insert at specific position (0-indexed)
    public static Node insertAtPosition(Node head, int val, int pos) {
        if (pos == 0) return insertAtBeginning(head, val);

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // 4. Delete node at position (0-indexed)
    public static Node deleteAtPosition(Node head, int pos) {
        if (head == null) return null;
        if (pos == 0) return head.next;

        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    // 5. Search for a value
    public static boolean search(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // 6. Reverse the list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    // 7. Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test all
    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        System.out.print("Original list: ");
        printList(head);

        head = insertAtBeginning(head, 5);
        System.out.print("After insert at beginning: ");
        printList(head);

        head = insertAtPosition(head, 25, 3);
        System.out.print("After insert at position 3: ");
        printList(head);

        head = deleteAtPosition(head, 2);
        System.out.print("After delete at position 2: ");
        printList(head);

        boolean found = search(head, 20);
        System.out.println("Search 20: " + (found ? "Found" : "Not Found"));

        head = reverse(head);
        System.out.print("After reverse: ");
        printList(head);
    }
}

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    public Node reverseDoublyList(Node head) {
        if (head == null || head.next == null) return head;

        Node current = head;
        Node last = null;

        while (current != null) {
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }

        return last.prev;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node createDoublyLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        Node head = createDoublyLinkedList(values);

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        Node reversedHead = sol.reverseDoublyList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}

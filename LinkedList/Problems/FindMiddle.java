public  class FindMiddle {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // LeetCode-style method: return middle node
    public static ListNode findMiddle(ListNode head) {
        //Enter code here 
        if(head==null&&head.next==null )return head;
        ListNode slow=head,fast=head;
        while( fast!=null&&fast.next!=null ){
        fast=fast.next.next;
        slow=slow.next;
        }
        return slow;
    }

    // Helper to create a linked list from array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper to print list from node
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // ✅ Main function with test cases
    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 6},
            {1},
            {1, 2}
        };

        for (int[] test : testCases) {
            ListNode head = createList(test);
            System.out.print("Input List: ");
            printList(head);

            ListNode middle = findMiddle(head);
            System.out.println("Middle Node Value: " + (middle != null ? middle.val : "null"));
            System.out.println("-----");
        }
    }
}


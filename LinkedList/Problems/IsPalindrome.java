public class IsPalindrome {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        }
        return prev;
    }
    // LeetCode-style method: you will write the solution here
    public static boolean isPalindrome(ListNode head) {
        // Write your code here
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode check=reverse(slow.next);
        ListNode temp=head;
        while(check!=null){
            if(temp.val!=check.val){
                return false;
            }
                temp = temp.next;
                check = check.next;
        }
        return true; 
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
            {1, 2, 2, 1},
            {1, 2},
            {1, 2, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {1},
            {}
        };

        for (int[] test : testCases) {
            ListNode head = createList(test);
            System.out.print("Input List: ");
            printList(head);

            boolean result = isPalindrome(head);
            System.out.println("Is Palindrome: " + result);
            System.out.println("-----");
        }
    }
}

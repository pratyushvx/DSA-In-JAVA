public class Sort {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        // Dummy heads for 0s, 1s and 2s
        ListNode ZeroHead=new ListNode(-1);
        ListNode OneHead=new ListNode(-1);
        ListNode TwoHead=new ListNode(-1);
        ListNode zero=ZeroHead,one=OneHead,two=TwoHead;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==0){
            zero.next=temp;
            zero=zero.next;
            }else if(temp.val==1){
                one.next=temp;
                one=one.next;
            }else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=OneHead.next;
        one.next=TwoHead.next;
        two.next=null;
        return ZeroHead.next;
    }

    // Utility to create a list from array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Utility to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main function with test cases
    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 0, 1, 2, 0},
            {2, 2, 1, 1, 0, 0},
            {0, 0, 0},
            {1, 1, 1},
            {2, 0, 1},
            {},
            {0}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.print("Original List " + (i + 1) + ": ");
            ListNode head = createList(testCases[i]);
            printList(head);
            head = sortList(head);
            System.out.print("Sorted   List " + (i + 1) + ": ");
            printList(head);
            System.out.println("------------------------");
        }
    }
}

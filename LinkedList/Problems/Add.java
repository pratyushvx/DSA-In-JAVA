import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) { 
        this.val = val; 
    }
}

public class Add {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Your solution here
        ListNode t1 = l1, t2 = l2;
        int left=0;
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(t1!=null || t2!=null){
        int sum=left;
        if(t1!=null) sum+=t1.val;   
        if(t2!=null) sum+=t2.val;
        ListNode newnode=new ListNode(sum%10);
        current.next=newnode;
        current=current.next;
        //ll.add(sum%10);
        left=sum/10;
        if(t1!=null) t1=t1.next;   
        if(t2!=null) t2=t2.next;
        }
        if(left!=0){
        ListNode newnode=new ListNode(left);
        current.next=newnode;
        current=current.next;
        }
        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method to test addTwoNumbers
    public static void main(String[] args) {
    Add sol = new Add();

    // Test Case 1
    int[] num1 = {2, 4, 3};  // represents 342
    int[] num2 = {5, 6, 4};  // represents 465
    ListNode l1 = createList(num1);
    ListNode l2 = createList(num2);
    System.out.println("Test Case 1:");
    System.out.print("Input List 1: "); printList(l1);
    System.out.print("Input List 2: "); printList(l2);
    ListNode result = sol.addTwoNumbers(l1, l2);
    System.out.print("Result List: "); printList(result);
    System.out.println();

    // Test Case 2
    int[] num3 = {9, 9};     // represents 99
    int[] num4 = {1};        // represents 1
    ListNode l3 = createList(num3);
    ListNode l4 = createList(num4);
    System.out.println("Test Case 2:");
    System.out.print("Input List 1: "); printList(l3);
    System.out.print("Input List 2: "); printList(l4);
    result = sol.addTwoNumbers(l3, l4);
    System.out.print("Result List: "); printList(result);
    System.out.println();

    // Test Case 3
    int[] num5 = {1, 8};     // represents 81
    int[] num6 = {0};        // represents 0
    ListNode l5 = createList(num5);
    ListNode l6 = createList(num6);
    System.out.println("Test Case 3:");
    System.out.print("Input List 1: "); printList(l5);
    System.out.print("Input List 2: "); printList(l6);
    result = sol.addTwoNumbers(l5, l6);
    System.out.print("Result List: "); printList(result);
}

}

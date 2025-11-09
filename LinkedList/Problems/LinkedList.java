public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Insert at beginning
    public Node InsertatBeg(int data, Node head) {
        Node newnode = new Node(data);
        newnode.next = head;
        return newnode;
    }

    // Insert at last
    public Node insertAtLast(int data, Node head) {
        if (head == null) return new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newnode = new Node(data);
        temp.next = newnode;
        return head;
    }

    // Insert at specific position
    public Node insertAtPos(int data, Node head, int pos) {
        if (head == null) {
            if (pos == 1) return new Node(data);
            else return null;
        }
        if (pos == 1) {
            return InsertatBeg(data, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == pos - 1) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return head;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }
    // delete 
    public Node deleteatFirst(Node head){
        if(head==null) return null;
        head=head.next;
        return head;
    }
    public Node deleteatLast(Node head){
        if(head==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public Node deleteAtPos(Node head, int pos) {
    if (head == null) {
        return null;
    }
    if (pos == 1) {
        return deleteatFirst(head);
    }
    Node temp = head;
    Node prev = null;
    int cnt = 0;
    while (temp != null) {    // Change here: use temp != null to also handle last node
        cnt++;
        if (cnt == pos) {
            break;
        }
        prev = temp;
        temp = temp.next;
    }
    if (temp == null) {      // Position out of range
        System.out.println("Position out of bounds.");
        return head;
    }
    prev.next = temp.next;   // Remove node at position
    // No need to do temp.next = null;  
    return head;
}

    // Display the list
    public void Display(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
        // Main function
    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    LinkedList.Node head = null;

    // Insert 10 elements
    head = ll.InsertatBeg(90, head);       // 90
    head = ll.InsertatBeg(80, head);       // 80 -> 90
    head = ll.insertAtLast(100, head);     // 80 -> 90 -> 100
    head = ll.insertAtPos(85, head, 2);    // 80 -> 85 -> 90 -> 100
    head = ll.insertAtPos(95, head, 4);    // 80 -> 85 -> 90 -> 95 -> 100
    head = ll.insertAtLast(110, head);     // ... -> 100 -> 110
    head = ll.insertAtLast(120, head);     // ... -> 110 -> 120
    head = ll.InsertatBeg(70, head);       // 70 -> ...
    head = ll.InsertatBeg(60, head);       // 60 -> 70 -> ...
    head = ll.insertAtPos(75, head, 3);    // 60 -> 70 -> 75 -> ...

    System.out.println("List after 10 insertions:");
    ll.Display(head);                      // Should print 60 -> 70 -> 75 -> 80 -> ...

    // Delete first node
    head = ll.deleteatFirst(head);
    System.out.println("\nAfter deleting first node:");
    ll.Display(head);

    // Delete last node
    head = ll.deleteatLast(head);
    System.out.println("\nAfter deleting last node:");
    ll.Display(head);

    // Delete at position (e.g., delete 4th node)
    head = ll.deleteAtPos(head, 4);
    System.out.println("\nAfter deleting node at position 4:");
    ll.Display(head);
}
}

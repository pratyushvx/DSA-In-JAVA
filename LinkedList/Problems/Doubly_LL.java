public class Doubly_LL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;    
        }
        Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
        }
    }
    public Node insertAtBeg(int data,Node head){
        if(head==null) return new Node(data);
        Node newnode=new Node(data);
        newnode.next=head;
        head.prev=newnode;
        return newnode;
    }
    public Node insertBeforeTail(int data,Node head){
        if(head==null) return new Node(data);
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node back=temp.prev;
        newnode.next=temp;
        newnode.prev=back;
        back.next=newnode;
        temp.prev=newnode;
        return head;
    }
    public Node insertatK(int data,Node head,int pos){
        if(head==null) return new Node(data);
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==pos) break;
            temp=temp.next;
        }
        Node back=temp.prev;
        Node newnode=new Node(data);
        newnode.next=temp;
        newnode.prev=back;
        temp.prev=newnode;
        back.next=newnode;
        return head;
    }
    //Deleting Operations
    public Node deleteFirst(Node head){
        if(head==null || head.next==null) return null;
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }
    public Node deleteLast(Node head){
         if(head==null || head.next==null) return null;
         Node temp=head;
         while(temp.next!=null){
         temp=temp.next;
         }
         Node prev=temp.prev;
         prev.next=null;
         temp.prev=null;
         return head;
    }
    public Node deleteK(Node head,int pos){
       Node temp=head;
       int count=0;
       while(temp!=null){
        count++;
        if(count==pos) break;
        temp=temp.next;
       }
       Node front=temp.next;
       Node back=temp.prev;
       if(front==null && back==null) {
       return null;
       }
       else if(front==null){
        return deleteLast(head);
       }
       else if(back==null) {
       return deleteFirst(head);
       }
      // back<-temp->front
      back.next=front;
      front.prev=back;
      temp.next=null;
      temp.prev=null;
      return head;
}
    public void displayForward(Node head){
        Node temp=head;
        System.out.print("null <->");
        while(temp!=null){
        System.out.print(temp.data+" <-> ");
        temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
    Doubly_LL dll = new Doubly_LL();
    Doubly_LL.Node head = null;

    // Insert at beginning
    head = dll.insertAtBeg(10, head);    // List: 10
    head = dll.insertAtBeg(20, head);    // List: 20 <-> 10
    head = dll.insertAtBeg(30, head);    // List: 30 <-> 20 <-> 10

    // Insert before tail
    head = dll.insertBeforeTail(25, head); // List: 30 <-> 20 <-> 25 <-> 10

    // Insert at position 3
    head = dll.insertatK(22, head, 3);      // List: 30 <-> 20 <-> 22 <-> 25 <-> 10

    System.out.println("Initial Doubly Linked List (forward):");
    dll.displayForward(head);              // Expected: null <-> 30 <-> 20 <-> 22 <-> 25 <-> 10 <-> null

    // Delete last
    head = dll.deleteLast(head);           // Expected: 30 <-> 20 <-> 22 <-> 25
    System.out.println("\nAfter deleteLast:");
    dll.displayForward(head);

    // Delete first
    head = dll.deleteFirst(head);          // Expected: 20 <-> 22 <-> 25
    System.out.println("\nAfter deleteFirst:");
    dll.displayForward(head);

    // Delete at position 2
    head = dll.deleteK(head, 2);           // Expected: 20 <-> 25
    System.out.println("\nAfter deleteK(pos=2):");
    dll.displayForward(head);
}
    }

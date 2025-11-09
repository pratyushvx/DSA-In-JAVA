public class practice {
    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;
        }        
    }
    public static Node head;
    public static Node tail;
    
    public static void add(int data){
        Node newnode=new Node(data);
        if(head==null){tail=head=newnode; return;}
        tail.next=newnode;
        tail=newnode;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice ll=new practice();
        ll.add(2);
        ll.add(8);
        
        printList();




    }
}

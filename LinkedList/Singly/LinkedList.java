public class LinkedList{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addatnum(int value,int data){
     Node temp=head;
     while(temp.data!=value){
        temp=temp.next;
     }
     Node newnode=new Node(data);
     newnode.next=temp.next;
     temp.next=newnode;
    
    }

     public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
     }
     public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
     }
     public void display(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
     }
     public void insertatpos(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }

         Node temp=head;
         int i=0;
         while(i<index-1){
            i++;
            temp=temp.next;
         }
         Node newnode=new Node(data);
         size++;
         newnode.next=temp.next;
         temp.next=newnode;
     }
     public int removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return 0;
        }
            else if(size==1){
                int data=head.data;
                head=tail=null;
                size--;
                return data;
                
            }
        int data=head.data;
        head=head.next;
         size--;
        return data;
     }
     public int deleteatlast(){
        if(size==0){
            System.out.println("LL is Empty");
            return 0;
        }
        else if(size==1){
            int data=head.data;
            head=tail=null;
            size--;
            return data;
           
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;

        }
        int data=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return data;
     }
     public void search(int data){
        Node temp=head;
        for(int i=1;i<size-1;i++){
            
            if(temp.data==data){
                System.out.println("\nIndex->"+i);
                return;
            }
            temp=temp.next;
            }
            System.out.println("Not present");
            
         
     }
     public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.insertatpos(6,2);
        ll.insertatpos(9,0);
        //ll.display();
        ll.removefirst();
        ll.deleteatlast();
        System.out.println();
        ll.addatnum(6,7);
        ll.display();
        //ll.search(6);

     }
    }
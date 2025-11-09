public class queuell {
    static class node{
        int data;
        node next;
       node (int data){
        this.data=data;
        this.next=null;
       } 
    }
    static class queue{
        static int size;
        static node head=null;
        static node tail=null;
        public static boolean isempty(){
          return head==null ;  
        }
        public static void enqueue(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            System.out.println(data +"has been inserted");
            return;
        }
        tail.next=newnode;
        tail=newnode;
        System.out.println(data +"has been inserted");
        }
        public static void dequeue(){
            if(isempty()){
                System.out.println("LL is empty");
                return;
            }
            int data=head.data;
            if(head==tail){
                head=tail=null;
             
                return;
            }
            head=head.next;
            size--;
            System.out.println(data +" has been removed");
        }
        public static void peek(){
            if(isempty()){
                System.out.println("LL is empty");
                return;
            }
            System.out.println("Peak : " + head.data);
        }
        public static void display(){
           node temp=head;
         for(int i=1;i<=size;i++){
            System.out.println(temp.data);
            temp=temp.next;
         }
           }
        }

    
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.peek();
        q.display();
    }
}

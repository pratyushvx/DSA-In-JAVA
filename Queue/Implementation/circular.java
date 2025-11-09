public class circular {
    static class queue{
    static int front;
    static int rear;
   static  int size;
    static int a[];
    queue(int data){
        front=-1;
        rear=-1;
        a=new int[data];
        size=data;
    }
    public static boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        a[rear]=data;
    }
    public static void remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int result=a[front];
        if(front==rear){
            front=rear=-1;
           return;
        }
        front=(front+1)%size;
        System.out.println(result +" is popped");
    }
    public static int peek(){
        return a[front];
    }
    }
public static void main(String[] args) {
    queue q=new queue(10);
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
    }
}
    
}

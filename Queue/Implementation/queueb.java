public class queueb {
    static class queue{
        static int a[];
        int size;
        int rear;
        queue(int n){
            a=new int[n];
            size=n;
            rear=-1;
        }
        boolean isempty(){
            return rear==-1;
        }
        void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
                
            }
            rear++;
            a[rear]=data;
        }
        void dequeue(){
            if(isempty()){
                System.out.println("Queue is Empty");
                return;
            }
            int data=a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            System.out.println(data + "is being dequeued");
        }
        void peek(){
        System.out.println(a[0]);
        }
        void display(){
            for(int i=0;i<=rear;i++){
                System.out.println(a[i]);
            }
        }
}
public static void main(String[] args) {
    queue s=new queue(10);
    s.enqueue(1);
    s.enqueue(1);
    s.enqueue(2);
    s.display();
    s.dequeue();
    s.display();
    
}

    
}

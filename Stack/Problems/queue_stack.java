package Problems;

//Implement Queue Using Stack in Java
import java.util.Stack;
class queue_stack{
    public static Stack<Integer> push(Stack<Integer> s1,Stack<Integer> s2,int data){
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return s1;
    }
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        push(s1, s2, 10); // Enqueue 10
        push(s1, s2, 20); // Enqueue 20
        push(s1, s2, 30); // Enqueue 30

        System.out.println("Front of queue: " + s1.peek()); // Should be 10
        System.out.println("Dequeued: " + s1.pop());         // Should remove 10
        System.out.println("Front after one dequeue: " + s1.peek()); // Should be 20
    }
}
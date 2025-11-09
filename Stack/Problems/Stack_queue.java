package Problems;

//Implement Stack Using Queue
import java.util.*;
class stack_queue{
    public static Queue<Integer> push(Queue<Integer> q,int data){
    int s=q.size();
        q.add(data);
    for(int i=1;i<=s;i++){
        q.add(q.peek());
        q.poll();
    }
    return q;    
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        push(q,1);
        push(q,12);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
    }
}
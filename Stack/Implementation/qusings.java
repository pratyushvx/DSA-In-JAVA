import java.util.*;
public class qusings{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public static void add(int data){
        while(!s1.isEmpty()){
           s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public static void remove(){
        int data=s1.pop();
        System.out.println(data +" is popped sucessfully");
    }
    public static void print(){
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
    public static void main(String[] args) {
        qusings q =new qusings();
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
    }
}
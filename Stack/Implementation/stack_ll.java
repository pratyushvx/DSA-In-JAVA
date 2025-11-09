import java.util.*;
public class stack_ll {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        static class Stack{
           static Node head=null;
           static int size;
            
          boolean isempty(){
            return head==null;
          }
          public void push(int data){
            Node newnode=new Node(data);
            size++;
            if(isempty()){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
                }
          }
          public int pop(){
            if(isempty()){
                return -1;
            }
           int data=head.data;
           head=head.next;
           size--;
           System.out.println("popped element is"+data);
           return data;
          }
          public void peek(){
            if(isempty()){
                return;
            }
            System.out.println("peek element is"+head.data);
          }
          public void display(){
            Node temp=head;
             for(int i=0;i<size;i++){
                System.out.println(temp.data);
                 temp=temp.next;
             }
          }
        }
        
    
    public static void main(String[] args) {
        Stack s =new Stack();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter choises \n1.Push \n2.Pop\n3.Peek\n4.Display\nExit\n Enter Choises");
            int ch=sc.nextInt();
            switch(ch){
               
                case 1:System.out.println("Enter a number to be pushed");
                int push=sc.nextInt();
                s.push(push);
                break;
                case 2:s.pop();
                break;
                case 3:s.peek();
                break;
                case 4:s.display();
                break;
                case 5: return;
            }
            }
      
    }
    
}

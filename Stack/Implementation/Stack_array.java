import java.util.Scanner;
public class Stack_array {
     int max=100;
    int top;
    int a[]=new int[max];
    Stack_array(){
        top=-1;
    }
    void push(int data){
        if(top>=max-1){
            System.out.println("Stack overflow");
        }
        else {
            a[++top]=data;
            System.out.println(a[top]+" Has been pushed");
        }
    }
    void pop(){
        if(top<0){
            System.out.println("Stack underflow");
        }
        else{
            int x=a[top];
            top--;
            System.out.println(x +" is been popped");
        }
    }
    void peek(){
        int x=a[top];
        System.out.println("peek element is :"+x);
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.println(" "+a[i]);

        }
    
}
   
    public static void main(String args[]) {
    Stack_array s=new Stack_array();
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
            case 4:s.print();
            break;
            case 5: return;
        }

        
    }
    
    }
    
    }

    
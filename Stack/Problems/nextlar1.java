import java.util.*;

public class nextlar1 {

    public int[] nextLargerElement(int[] arr) {
    Stack<Integer> s=new Stack<>();
    int n=arr.length;
    int sol[]=new int[n];
    for
    (int i=n-1;i>-1;i--){
    while(!s.isEmpty() && arr[i]>=s.peek()){
        s.pop();
    }
    sol[i]=s.isEmpty() ? -1 :s.peek();
    s.push(arr[i]);
    }
     return sol;
    }

    public static void main(String[] args) {
        nextlar1 obj = new nextlar1(); // ✅ Use class name here

        int[] arr = {4, 5, 2, 25, 7};
        int[] result = obj.nextLargerElement(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}

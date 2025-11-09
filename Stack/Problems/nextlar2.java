import java.util.*;

public class nextlar2 {

    public int[] nextLargerElement(int[] arr) {
    Stack<Integer> s=new Stack<>();
    int n=2*arr.length-1;
    int sol[]=new int[arr.length];
    for(int i=n;i>-1;i--){
        int index=i%arr.length;
        while(!s.isEmpty() && arr[index]>=s.peek()){
            s.pop();
        }
        if(i<arr.length){
            sol[i]=s.isEmpty()?-1:s.peek();
        }
        s.push(arr[index]);
    }
    return sol;
    }

    public static void main(String[] args) {
        nextlar2 obj = new nextlar2(); // ✅ Use class name here

        int[] arr = {4, 5, 2, 25, 7};
        int[] result = obj.nextLargerElement(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}

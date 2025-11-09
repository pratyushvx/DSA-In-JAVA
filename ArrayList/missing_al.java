import java.util.ArrayList;
import java.util.Scanner;
public class missing_al {
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    System.out.println("Enter numbers :");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum1=0;
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        list.add(a);
        sum1+=a;
    }
    System.out.println(list);
    //find missing numbers
    int sum=(n*(n+1))/2;
    int missing=sum-sum1;
    System.out.println(missing);



    }
    
}

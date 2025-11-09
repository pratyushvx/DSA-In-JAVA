//Sum of  N number by parameterised way
public class R06 {
    public static int sum(int n,int sum){
    if(n<1){
      return sum;
    }
    return sum(n-1,sum+n);
    }
    public static void main(String[] args) {
    System.out.println(sum(3,0));  
    }
}

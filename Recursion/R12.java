//Print pow of number
public class R12 {
    public static int power(int a,int n,int sum){
        if(n<1) return a;
        power(a,n-1,sum);
        sum+=a;
        return sum; 
    }

    
    public static void main(String[] args) {
        int a=2,n=1
        ;
        System.out.println(power(a,n,0));
    }
    
}

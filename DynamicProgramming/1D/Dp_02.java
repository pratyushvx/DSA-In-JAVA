//Tabulation Method
public class Dp_02 {
    public static void main(String[] args) {
        int n=5;
        // int dp[]=new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // System.out.println(dp[n]);
        //Optimized ..
    int prev1=1;
    int prev2=0;
    int fib=0;
    for(int j=2;j<=n;j++){
        fib=prev1+prev2;
        prev2=prev1;
        prev1=fib;
    }
    System.out.println(fib);
    }
}

import java.util.Arrays;

public class Dp_04{
    public static int jump(int index,int a[],int[] dp){
        if(index==0) return 0;
        int right=Integer.MAX_VALUE;
        if(dp[index]!=-1) return dp[index];
        int left=jump(index-1,a,dp)+Math.abs(a[index]-a[index-1]);
        if(index>1) {
            right=jump(index-2,a,dp)+Math.abs(a[index]-a[index-2]);
        }
        return dp[index]=Math.min(left,right);
    }
    public static void main(String[] args) {
        int a[]={2,1,3,5,4};
        int dp[]=new int[a.length];
        Arrays.fill(dp,-1);
    System.out.println(jump(a.length-1,a,dp));
    }
}
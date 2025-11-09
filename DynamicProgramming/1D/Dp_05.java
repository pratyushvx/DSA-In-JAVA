//FRog jump with K distance ...
import java.util.Arrays;

public class Dp_05 {
    public static int frog_jump(int index,int a[],int[] dp,int k){
    if(index==0) return 0;
    int min=Integer.MAX_VALUE;
    if(dp[index]!=-1) return dp[index];
    for(int i=1;i<=k;i++){
        if(index-i<0) continue;
        int sol=frog_jump(index-i,a,dp,k)+Math.abs(a[index]-a[index-i]);
        min=Math.min(min,sol);
    }
    return dp[index]=min;
    }
    public static void main(String[] args) {
        int a[]={15, 4, 1, 14, 15};
        int dp[]=new int[a.length];
        Arrays.fill(dp,-1);
        System.out.println(frog_jump(a.length-1,a,dp,3));
    }
}


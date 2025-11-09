import java.util.Arrays;

public class Dp_07 {
    public static int ninja(int[][] given,int last,int index,int[][] dp){
    if(index==0){
        int maxi=0;
        for(int i=0;i<given[0].length;i++){
            if(i==last) continue;
        maxi=Math.max(given[0][i],maxi);
        }
        return maxi;
    }
    if(dp[index][last]!=-1) return dp[index][last];
    int maxi=0;
    for(int i=0;i<given[index].length;i++){
        if(i==last) continue;
        
        int count=ninja(given,i,index-1,dp)+given[index][i];
        maxi=Math.max(count,maxi);
    }
    return dp[index][last]=maxi;
    }
    public static void main(String[] args) {
    int[][] given={
            {5,10,50},
            {10,50,1},
            {5,100,11}
        };
        int[][] dp=new int[given.length][given[0].length+1];
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
    int points=ninja(given,given[0].length,given[0].length-1,dp);
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[i].length;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(points);

    }
}

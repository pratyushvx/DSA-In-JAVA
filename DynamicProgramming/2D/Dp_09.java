import java.util.*;

public class Dp_09 {

    public static int trace_path(int[][] path, int i, int j, int[][] dp) {
        if (i == path.length - 1 && j == path[0].length - 1) return 1;
        if (i >= path.length || j >= path[0].length) return 0;
        if (path[i][j] == 1) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int a = trace_path(path, i + 1, j, dp);
        int b = trace_path(path, i, j + 1, dp);

        return dp[i][j] = a + b;
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        return trace_path(obstacleGrid, 0, 0, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter grid values (0 for empty, 1 for obstacle):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        
        int result = uniquePathsWithObstacles(grid);
        System.out.println("Number of unique paths: " + result);

        sc.close();
    }
}

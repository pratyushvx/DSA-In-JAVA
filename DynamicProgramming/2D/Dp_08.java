public class Dp_08 {

    public static int travel(int m, int n, int i, int j) {
        if(i==m-1 && j==n-1) return 1;
        if(i>m-1 || j>n-1) return 0;

        int a = travel(m, n, i + 1, j);
        int b = travel(m, n, i, j + 1);
        return a + b;
    }

    public static int uniquePaths(int m, int n) {
        return travel(m, n, 0, 0);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int result = uniquePaths(m, n);
        System.out.println("Unique Paths: " + result);
    }
}

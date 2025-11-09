import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        
        for (int i = n / 2 + 1; i < n; i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(n - i);
            
            if (prefix.equals(suffix)) {
                System.out.println("YES");
                System.out.println(prefix);
                return;
            }
        }
        
        System.out.println("NO");
    }
}

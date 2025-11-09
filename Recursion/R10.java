//Check if String is pallindrome using recursion
import java.util.Scanner;

public class R10 {
    public static boolean check(String s,int i,int n){
        if(i>n/2) return true;
        if(s.charAt(i)!=s.charAt(n-1-i)){
            return false;
        }
        return check (s,i+1,n);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string
        String input = scanner.nextLine();

        // Display the input string
        System.out.println("You entered: " + input);
        System.out.println(check(input,0,input.length()));
        // Close the scanner
        scanner.close();
    }
}

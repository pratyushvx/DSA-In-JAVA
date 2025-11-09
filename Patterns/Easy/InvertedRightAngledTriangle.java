public class InvertedRightAngledTriangle {

    /**
     * Prints an inverted right-angled triangle pattern of '*' characters.
     * The number of characters in each row decreases by one, starting from N.
     * @param N The height of the triangle (number of rows and the maximum row width).
     */
    public static void printInvertedRightAngledTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a triangle pattern.");
            return;
        }

        System.out.println("--- Inverted Right-Angled Triangle Pattern (N = " + N + ") ---");
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=5
        printInvertedRightAngledTriangle(5);

        // Test Case 2: Smaller size N=3
        printInvertedRightAngledTriangle(3);

        // Test Case 3: Larger size N=7
        printInvertedRightAngledTriangle(7);

        // Test Case 4: Edge case (invalid input)
        printInvertedRightAngledTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR RIGHT-ANGLED TRIANGLE (DECREASING/INVERTED)
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints an inverted 
 * right-angled triangle pattern using the asterisk character ('*'). The pattern must 
 * have N rows, where the first row has N stars and the last row has 1 star.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 5
 * Output:
 * *****
 * ****
 * ***
 * **
 * *
 * 2. Input: N = 3
 * Output:
 * ***
 * **
 * *
 * Approach explanation
 * --------------------
 * The inverted triangle pattern requires the number of stars to decrease as the row number increases.
 * We can achieve this by iterating the outer loop in reverse and linking the inner loop's boundary to the outer loop's current value.
 *
 * 1.  **Outer Loop (Rows):** A 'for' loop (index `i`) runs from N down to 1 (`i = N; i >= 1; i--`). 
 * The current value of `i` directly represents the number of stars required for that row.
 *
 * 2.  **Inner Loop (Columns/Stars):** A nested 'for' loop (index `j`) is responsible for printing the stars. 
 * The condition is `j <= i`.
 * - In the first iteration of the outer loop (`i = N`), the inner loop runs N times. Result: N stars.
 * - In the last iteration of the outer loop (`i = 1`), the inner loop runs once. Result: 1 star.
 *
 * 3.  **Printing Logic:** Inside the inner loop, `System.out.print("*")` prints the character.
 *
 * 4.  **Row Completion:** After the inner loop finishes, `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The total number of print operations is the sum of $N + (N-1) + \dots + 1$, which is $N(N+1)/2$. 
 * Since $N^2$ is the dominant term, the time complexity is $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The algorithm uses a constant amount of extra memory for variables (N, i, j), making the space complexity $O(1)$.
 */
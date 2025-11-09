public class RightAngledTriangle {

    /**
     * Prints a right-angled triangle pattern of '*' characters.
     * The number of characters in each row increases by one.
     * @param N The height of the triangle (number of rows).
     */
    public static void printRightAngledTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a triangle pattern.");
            return;
        }

        System.out.println("--- Right-Angled Triangle Pattern (N = " + N + ") ---");
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=5
        printRightAngledTriangle(5);

        // Test Case 2: Smaller size N=3
        printRightAngledTriangle(3);

        // Test Case 3: Larger size N=8
        printRightAngledTriangle(8);

        // Test Case 4: Edge case (invalid input)
        printRightAngledTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR RIGHT-ANGLED TRIANGLE (INCREASING)
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a right-angled 
 * triangle pattern using the asterisk character ('*'). The pattern must have N rows, 
 * and the number of characters in the i-th row must equal i.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * *
 * **
 * ***
 * ****
 * 2. Input: N = 5
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 * Approach explanation
 * --------------------
 * To generate this pattern, we must dynamically change the number of stars printed in each row.
 * The core principle is that the inner loop's termination condition must depend on the outer loop's index.
 * * 1.  **Outer Loop (Rows):** A 'for' loop (index `i`) runs from 1 to N. This determines the current row number.
 * - Row 1 means `i = 1`.
 * - Row N means `i = N`.
 *
 * 2.  **Inner Loop (Columns/Stars):** A nested 'for' loop (index `j`) is responsible for printing the stars. 
 * The crucial difference here is the loop condition: `j <= i`.
 * - In the first iteration of the outer loop (`i = 1`), the inner loop runs only once (`j=1`). Result: 1 star.
 * - In the last iteration of the outer loop (`i = N`), the inner loop runs N times (`j=1` to `N`). Result: N stars.
 *
 * 3.  **Printing Logic:** Inside the inner loop, `System.out.print("*")` prints the character.
 *
 * 4.  **Row Completion:** After the inner loop finishes, `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * Although this is a triangle and not a square, the total number of operations (print statements) 
 * still scales quadratically. The total number of stars printed is the sum of 1 to N, 
 * which is calculated as $N(N+1)/2$. Since $N^2$ is the dominant term, the time complexity remains $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The memory usage remains constant, as it only uses a few variables (N, i, j) regardless of the input size N.
 */
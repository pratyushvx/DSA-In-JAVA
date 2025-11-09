public class SymmetricTriangle {

    /**
     * Prints a centered, symmetric triangle (pyramid) pattern of '*' characters.
     * @param N The height of the triangle (number of rows).
     */
    public static void printSymmetricTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Symmetric Triangle / Pyramid Pattern (N = " + N + ") ---");
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4
        printSymmetricTriangle(4);

        // Test Case 2: Smaller size N=3
        printSymmetricTriangle(3);

        // Test Case 3: Larger size N=7
        printSymmetricTriangle(7);

        // Test Case 4: Edge case (invalid input)
        printSymmetricTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR SYMMETRIC TRIANGLE (PYRAMID) PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a centered, 
 * symmetric triangle (pyramid) pattern using the asterisk character ('*'). The pattern 
 * must have N rows.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * *
 * ***
 * *****
 * *******
 * 2. Input: N = 5
 * Output:
 * *
 * ***
 * *****
 * *******
 * *********
 * * Approach explanation
 * --------------------
 * To create a centered pyramid, each row must be composed of three parts: 
 * 1. Leading spaces (for centering).
 * 2. Stars (the pyramid body).
 * 3. A newline character.
 *
 * For a pyramid of height N, using 1-based indexing for the row `i`:
 *
 * 1.  **Outer Loop (Rows):** Iterates from $i=1$ to $N$.
 *
 * 2.  **Inner Loop 1 (Leading Spaces):**
 * - **Formula:** Number of spaces = $N - i$.
 * - This loop prints the necessary spaces to push the stars into the center.
 *
 * 3.  **Inner Loop 2 (Stars):**
 * - **Formula:** Number of stars = $2i - 1$.
 * - This loop prints the odd number of stars for the pyramid body.
 *
 * 4.  **Row Completion:** `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The total number of print operations (stars + spaces) scales quadratically with N.
 *
 * Space Complexity: O(1)
 * The memory usage is constant, as only a fixed number of variables are used.
 */
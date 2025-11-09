public class SolidSquarePattern {

    /**
     * Prints a solid square pattern of '*' characters of size N x N.
     * * @param N The side length of the square (number of rows and columns).
     */
    public static void printSolidSquare(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a square pattern.");
            return;
        }

        System.out.println("--- Solid Square Pattern (N = " + N + ") ---");
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4
        printSolidSquare(4);

        // Test Case 2: Larger size N=6
        printSolidSquare(6);

        // Test Case 3: Smallest valid size N=1
        printSolidSquare(1);

        // Test Case 4: Edge case (invalid input)
        printSolidSquare(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR SOLID SQUARE PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a solid 
 * square pattern composed of the asterisk character ('*'). The resulting pattern 
 * must have N rows and N columns.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * * * * * * * * * * * * * * * * * * * * *
 * 2. Input: N = 2
 * Output:
 * * * * * * *
 * Approach explanation
 * --------------------
 * The solid square pattern is the simplest type of pattern problem, as the same 
 * character ('*') must be printed at every position in the N x N grid.
 * This is solved using a standard setup of nested loops:
 *
 * 1.  **Outer Loop (Rows):** A 'for' loop (using index `i`) runs exactly N times. 
 * This loop is responsible for iterating through each of the N rows.
 *
 * 2.  **Inner Loop (Columns):** A second 'for' loop (using index `j`) is nested 
 * inside the outer loop and also runs exactly N times. This loop is responsible 
 * for printing the N characters that make up a single row.
 *
 * 3.  **Printing Logic:** Inside the inner loop, `System.out.print("* ")` is called 
 * to print the character without a newline.
 *
 * 4.  **Row Completion:** Once the inner loop completes (N characters have been 
 * printed for the current row), `System.out.println()` is called to insert a 
 * newline character, moving the cursor to the next line for the next iteration 
 * of the outer loop.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The algorithm involves two nested loops, where the inner loop executes N times for 
 * every iteration of the outer loop, which also executes N times. Therefore, the 
 * total number of print operations is N * N, leading to a quadratic time complexity.
 *
 * Space Complexity: O(1)
 * The algorithm uses a fixed, constant amount of extra memory for variables (N, i, j) 
 * regardless of the input size N. The pattern is directly printed to the console 
 * without requiring any large intermediate data structures.
 */
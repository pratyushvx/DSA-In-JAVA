public class HollowSquarePattern {

    /**
     * Prints a hollow square pattern of '*' characters of size N x N.
     * The asterisk is printed only on the border (first/last row/column).
     * @param N The side length of the square (number of rows and columns).
     */
    public static void printHollowSquare(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Hollow Square Pattern (N = " + N + ") ---");
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=5
        printHollowSquare(5);

        // Test Case 2: Larger size N=8
        printHollowSquare(8);

        // Test Case 3: Smallest size N=3
        printHollowSquare(3);

        // Test Case 4: Edge case (invalid input)
        printHollowSquare(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR HOLLOW SQUARE PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a square 
 * pattern of size N x N where only the outermost boundary is composed of the asterisk 
 * character ('*'), and the interior is filled with spaces.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 5
 * Output:
 * *****
 * * *
 * * *
 * * *
 * *****
 * 2. Input: N = 4
 * Output:
 * ****
 * * *
 * * *
 * ****
 * Approach explanation
 * --------------------
 * The Hollow Square pattern requires deciding, for every position (i, j) in the N x N grid, 
 * whether to print a '*' (if it's on the border) or a space (if it's in the interior). 
 * We use 1-based indexing for rows (i) and columns (j).
 *
 * 1.  **Outer Loop (Rows):** Iterates from $i=1$ to $N$.
 *
 * 2.  **Inner Loop (Columns):** Iterates from $j=1$ to $N$.
 *
 * 3.  **Conditional Logic:** Inside the inner loop, we check if the current position is on the boundary. 
 * A position (i, j) is on the boundary if any of the following conditions are true:
 * - It is the **First Row**: $i == 1$
 * - It is the **Last Row**: $i == N$
 * - It is the **First Column**: $j == 1$
 * - It is the **Last Column**: $j == N$
 *
 * The print logic uses an `if` statement: if `(i == 1 || i == N || j == 1 || j == N)` is true, print `*`. 
 * Otherwise, print a space (` `).
 *
 * 4.  **Row Completion:** `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The algorithm uses two nested loops, both running N times, to iterate over every position in the N x N grid. 
 * This results in a quadratic time complexity of $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The memory usage is constant, as only a fixed number of variables (N, i, j) are used regardless of the input size N.
 */
public class InvertedSymmetricTriangle {

    /**
     * Prints a centered, inverted symmetric triangle (inverted pyramid) pattern of '*' characters.
     * @param N The height of the triangle (number of rows and the maximum row width).
     */
    public static void printInvertedSymmetricTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Inverted Symmetric Triangle / Inverted Pyramid Pattern (N = " + N + ") ---");
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * N - (2 * i - 1)); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4
        printInvertedSymmetricTriangle(4);

        // Test Case 2: Smaller size N=3
        printInvertedSymmetricTriangle(3);

        // Test Case 3: Larger size N=7
        printInvertedSymmetricTriangle(7);

        // Test Case 4: Edge case (invalid input)
        printInvertedSymmetricTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR INVERTED SYMMETRIC TRIANGLE (INVERTED PYRAMID)
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a centered, 
 * inverted symmetric triangle (inverted pyramid) pattern using the asterisk character ('*'). 
 * The pattern must have N rows, starting with $2N-1$ stars in the first row and ending with 1 star 
 * in the last row.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * *******
 * *****
 * ***
 * *
 * 2. Input: N = 5
 * Output:
 * *********
 * *******
 * *****
 * ***
 * *
 * Approach explanation
 * --------------------
 * To create the inverted pyramid, we still use three main steps per row (spaces, stars, newline), 
 * but the logic for both the spaces and the stars is inverted compared to the regular pyramid. 
 * We use 1-based indexing for the row `i`, from 1 to N.
 *
 * 1.  **Outer Loop (Rows):** Iterates from $i=1$ to $N$.
 *
 * 2.  **Inner Loop 1 (Leading Spaces):**
 * - **Goal:** The number of leading spaces must increase from 0 in the first row to $N-1$ in the last row.
 * - **Formula:** Number of spaces = $i - 1$.
 * - This loop ensures the pattern remains centered by pushing the stars inward.
 *
 * 3.  **Inner Loop 2 (Stars):**
 * - **Goal:** The number of stars must decrease by 2 in each row, starting with $2N - 1$.
 * - **Formula:** Number of stars = $2N - (2i - 1)$, which simplifies to $2(N - i) + 1$.
 * - This loop prints the decreasing number of stars.
 *
 * 4.  **Row Completion:** `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The total number of characters printed (stars + spaces) in the $i$-th row is $(i-1) + (2N - 2i + 1)$, 
 * which simplifies to $2N - i$. Summing this from $i=1$ to $N$ results in a total number of operations proportional 
 * to $N^2$. The time complexity is $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The memory usage is constant, as only a fixed number of variables (N, i, j, k) are used.
 */
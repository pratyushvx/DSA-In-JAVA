public class BinaryRightTriangle {

    /**
     * Prints a right-angled triangle where the value at each position alternates
     * between 1 and 0. The value is determined by the parity of (row + column index).
     * @param N The height of the triangle (number of rows).
     */
    public static void printBinaryRightTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Binary Right Triangle Pattern (N = " + N + ") ---");
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=5
        printBinaryRightTriangle(5);

        // Test Case 2: Smaller size N=3
        printBinaryRightTriangle(3);

        // Test Case 3: Larger size N=6
        printBinaryRightTriangle(6);

        // Test Case 4: Edge case (invalid input)
        printBinaryRightTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR BINARY RIGHT TRIANGLE PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a right-angled 
 * triangle pattern of height N, where the elements alternate between '1' and '0'. The 
 * starting number of each row should alternate (Row 1 starts with 1, Row 2 starts with 0, etc.).
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 5
 * Output:
 * 1 
 * 0 1 
 * 1 0 1 
 * 0 1 0 1 
 * 1 0 1 0 1 
 * 2. Input: N = 3
 * Output:
 * 1 
 * 0 1 
 * 1 0 1 
 * Approach explanation
 * --------------------
 * The pattern is based on the position (row `i`, column `j`) within the triangle. The key insight 
 * is that the value should flip every time the position moves to the next column or the next row.
 * This alternating behavior is captured perfectly by the parity (even/odd) of the sum of the indices, 
 * $i + j$.
 *
 * - If $i + j$ is **even** (e.g., 1+1=2, 2+2=4, 3+1=4), the value printed is **1**.
 * - If $i + j$ is **odd** (e.g., 2+1=3, 3+2=5, 4+1=5), the value printed is **0**.
 *
 * **Implementation Steps (using 1-based indexing for `i` and `j`):**
 * 1.  **Outer Loop (Rows):** Iterates from $i=1$ to $N$.
 * 2.  **Inner Loop (Columns):** Iterates from $j=1$ to $i$ (to maintain the right-angled triangle shape).
 * 3.  **Conditional Print:** Inside the inner loop, we check `if ((i + j) % 2 == 0)`. If true, print '1', otherwise print '0'.
 * 4.  **Row Completion:** `System.out.println()` moves to the next line after each row.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The algorithm uses nested loops, with the inner loop running $1 + 2 + \dots + N$ times. 
 * The total number of print operations is $N(N+1)/2$, leading to a quadratic time complexity of $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The algorithm uses a constant amount of extra memory for variables (N, i, j), making the space complexity $O(1)$.
 */
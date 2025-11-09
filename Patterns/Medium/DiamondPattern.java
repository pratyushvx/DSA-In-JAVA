public class DiamondPattern {

    /**
     * Prints a full diamond pattern by combining the symmetric triangle and its inverse.
     * @param N The height of the upper half of the diamond (total rows will be 2*N - 1).
     */
    public static void printDiamondPattern(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Diamond Pattern (N = " + N + ") ---");
        
        // 1. Upper Half (Pyramid) including the widest middle row
        for (int i = 1; i <= N; i++) {
            
            // Leading Spaces: N - i
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Stars: 2*i - 1
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // 2. Lower Half (Inverted Pyramid) - starts from the row below the middle
        for (int i = 1; i <= N - 1; i++) {
            
            // Leading Spaces: i (increases from 1 to N-1)
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            
            // Stars: 2 * (N - i) - 1
            for (int k = 1; k <= (2 * (N - i) - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4 (7 total rows)
        printDiamondPattern(4);

        // Test Case 2: Smaller size N=3 (5 total rows)
        printDiamondPattern(3);

        // Test Case 3: Larger size N=6 (11 total rows)
        printDiamondPattern(6);

        // Test Case 4: Edge case (invalid input)
        printDiamondPattern(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR DIAMOND PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a complete 
 * diamond pattern using the asterisk character ('*'). The total pattern height will be 
 * 2N - 1 rows, with N being the row index of the widest part of the diamond.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * *
 * ***
 * *****
 * *******
 * *****
 * ***
 * *
 * 2. Input: N = 3
 * Output:
 * *
 * ***
 * *****
 * ***
 * *
 * Approach explanation
 * --------------------
 * The Diamond pattern is implemented by conceptually dividing it into two halves:
 * 1. The **Upper Half**: A standard Symmetric Triangle (Pyramid) of height N.
 * 2. The **Lower Half**: An Inverted Symmetric Triangle of height N-1 (since the widest 
 * middle row is already included in the Upper Half).
 *
 * **Upper Half (Rows 1 to N):**
 * - Outer loop: $i=1$ to $N$.
 * - Leading Spaces: $N - i$.
 * - Stars: $2i - 1$.
 *
 * **Lower Half (Rows N+1 to 2N-1):**
 * - Outer loop: To simplify indexing, we use a new loop counter $i=1$ to $N-1$.
 * - Leading Spaces: $i$. (The spaces increase as we move down from the center).
 * - Stars: $2 \times (N - i) - 1$. (This formula starts the star count from 5 for $N=4, i=1$ and decreases by 2 each time).
 *
 * By executing these two sets of nested loops sequentially, the complete centered diamond is formed.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The diamond pattern involves approximately $N^2$ print operations in the upper half and 
 * $(N-1)^2$ in the lower half. The overall number of operations scales quadratically 
 * with $N$. Thus, the time complexity is $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The algorithm uses a constant amount of extra memory for variables (N, i, j, k) regardless 
 * of the input size N, resulting in $O(1)$ space complexity.
 */
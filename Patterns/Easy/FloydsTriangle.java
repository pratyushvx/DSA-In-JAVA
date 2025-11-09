public class FloydsTriangle {

    /**
     * Prints Floyd's Triangle pattern, where numbers start at 1 and increment
     * sequentially across the entire triangle, filling a right-angled shape.
     * @param N The height of the triangle (number of rows).
     */
    public static void printFloydsTriangle(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Floyd's Triangle Pattern (N = " + N + ") ---");
        
        int currentNumber = 1;
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4 (10 elements total)
        printFloydsTriangle(4);

        // Test Case 2: Smaller size N=3 (6 elements total)
        printFloydsTriangle(3);

        // Test Case 3: Larger size N=6 (21 elements total)
        printFloydsTriangle(6);

        // Test Case 4: Edge case (invalid input)
        printFloydsTriangle(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR FLOYD'S TRIANGLE PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a right-angled 
 * triangle pattern (Floyd's Triangle). The numbers in the triangle must start from 1 and 
 * increase sequentially by one for every position in the pattern.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 2. Input: N = 5
 * Output:
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
 * Approach explanation
 * --------------------
 * Unlike the previous patterns where the value printed depended only on the row or a fixed character, 
 * Floyd's Triangle requires a value that continuously increments across all iterations of both loops.
 *
 * 1.  **External Counter:** A variable, `currentNumber`, is initialized to 1 outside of the main loop structure. 
 * This counter is maintained globally throughout the pattern generation.
 *
 * 2.  **Outer Loop (Rows):** The 'for' loop (index `i`) iterates from 1 to N to define the N rows of the triangle.
 *
 * 3.  **Inner Loop (Columns/Elements):** The nested 'for' loop (index `j`) iterates from 1 to `i` 
 * to create the right-angled triangle shape (row `i` has `i` elements).
 *
 * 4.  **Printing Logic:** Inside the inner loop, two steps are crucial:
 * a. Print the value of `currentNumber`.
 * b. Increment `currentNumber` immediately (`currentNumber++`) so the next printed value is one greater, 
 * regardless of whether it's the next column in the current row or the first column in the next row.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * The total number of print operations is the sum of $1 + 2 + 3 + \dots + N$, which is $N(N+1)/2$. 
 * Since $N^2$ is the dominating term, the time complexity is $O(N^2)$.
 *
 * Space Complexity: O(1)
 * The memory usage is constant, as it only uses a few variables (N, i, j, currentNumber) regardless of the input size N.
 */
public class RowNumberPattern {

    /**
     * Prints a triangle pattern where each row 'i' consists of the number 'i' repeated 'i' times.
     * @param N The height of the triangle (number of rows and the maximum row width).
     */
    public static void printRowNumberPattern(int N) {
        if (N <= 0) {
            System.out.println("Error: Input size N must be positive for a pattern.");
            return;
        }

        System.out.println("--- Row Number Pattern (N = " + N + ") ---");
        
        // Outer loop iterates through each row (i) from 1 to N
        for (int i = 1; i <= N; i++) {
            
            // Inner loop prints the number 'i' exactly 'i' times
            for (int j = 1; j <= i; j++) {
                
                System.out.print(i + " ");
            }
            
            // Move to the next line
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Standard size N=4
        printRowNumberPattern(4);

        // Test Case 2: Smaller size N=2
        printRowNumberPattern(2);

        // Test Case 3: Larger size N=7
        printRowNumberPattern(7);

        // Test Case 4: Edge case (invalid input)
        printRowNumberPattern(0);
    }
}

/*
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 * // PROBLEM DETAILS AND ANALYSIS FOR ROW NUMBER PATTERN
 * //////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * Problem statement
 * -----------------
 * Write a Java program that takes a positive integer N as input and prints a right-angled 
 * number triangle pattern. The pattern must have N rows, and in row 'i', the number 'i' 
 * should be printed 'i' times.
 *
 * Example inputs/outputs
 * ----------------------
 * 1. Input: N = 4
 * Output:
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
 * 2. Input: N = 5
 * Output:
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 5 
 * Approach explanation
 * --------------------
 * This pattern relies on directly using the outer loop's index to both control the count 
 * of elements in the inner loop and determine the value printed.
 *
 * 1.  **Outer Loop (Rows):** The 'for' loop (index `i`) iterates from 1 to N. The value of `i`
 * serves two purposes: it is the row number, and it is the digit we need to print.
 *
 * 2.  **Inner Loop (Columns/Count):** The nested 'for' loop (index `j`) iterates from 1 to `i`
 * (`j <= i`). This ensures that exactly `i` elements are printed in the current row.
 *
 * 3.  **Printing Logic:** Inside the inner loop, instead of printing a static character like '*', 
 * we print the current row number: `System.out.print(i + " ")`.
 *
 * 4.  **Row Completion:** After the inner loop completes, `System.out.println()` moves to the next line.
 *
 * Time and space complexity
 * -------------------------
 *
 * Time Complexity: O(N^2)
 * Similar to the basic triangle patterns, the total number of print operations is the sum 
 * of $1 + 2 + 3 + \dots + N$, which is $N(N+1)/2$. Therefore, the time complexity is dominated 
 * by the quadratic term, resulting in $O(N^2)$.
 *
 * Space Complexity: O(1)
 * Only a fixed number of variables (N, i, j) are used regardless of the input size N, 
 * leading to constant space complexity.
 */
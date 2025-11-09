// File: SecondLargestElement.java
public class SecondLargestElement {
    
    // Function to find second largest element without sorting
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found (array may have all elements same).");
        }

        return secondLargest;
    }

    // Manual Test Cases
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 40, 50}; // Expected: 40
        int[] test2 = {5, 5, 5, 5};        // Expected: Exception (no second largest)
        int[] test3 = {2, 1};              // Expected: 1
        int[] test4 = {7, 7, 8, 8, 9};     // Expected: 8
        int[] test5 = {-10, -20, -30, -5}; // Expected: -10

        System.out.println("Second Largest in test1: " + findSecondLargest(test1));
        try {
            System.out.println("Second Largest in test2: " + findSecondLargest(test2));
        } catch (Exception e) {
            System.out.println("Test2 Error: " + e.getMessage());
        }
        System.out.println("Second Largest in test3: " + findSecondLargest(test3));
        System.out.println("Second Largest in test4: " + findSecondLargest(test4));
        System.out.println("Second Largest in test5: " + findSecondLargest(test5));
    }
}

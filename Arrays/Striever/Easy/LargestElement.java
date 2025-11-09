// File: LargestElement.java

import java.util.*;

public class LargestElement {
    
    // Function to find the largest element in an array
    public int findLargest(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Main method to test manually
    public static void main(String[] args) {
        LargestElement solution = new LargestElement();
        
        // Test case 1
        int[] arr1 = {3, 7, 1, 9, 2};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Largest Element: " + solution.findLargest(arr1));
        
        // Test case 2
        int[] arr2 = {10, 10, 10};
        System.out.println("\nInput: " + Arrays.toString(arr2));
        System.out.println("Largest Element: " + solution.findLargest(arr2));
        
        // Test case 3
        int[] arr3 = {-5, -2, -8, -1};
        System.out.println("\nInput: " + Arrays.toString(arr3));
        System.out.println("Largest Element: " + solution.findLargest(arr3));
    }
}

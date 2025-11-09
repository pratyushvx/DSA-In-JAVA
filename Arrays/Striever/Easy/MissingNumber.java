// File name: MissingNumber.java

public class MissingNumber {

    // Method to find the missing number in the range [0..n]
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int total = nums.length * (nums.length + 1) / 2;
        return total - sum;
    }

    // Main method with sample test cases
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums1)); 
        // Expected: 2

        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2)); 
        // Expected: 2

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + solution.missingNumber(nums3)); 
        // Expected: 8

        int[] nums4 = {0};
        System.out.println("Missing number: " + solution.missingNumber(nums4)); 
        // Expected: 1
    }
}

/*
-----------------------------------
 Problem Statement:
 -----------------------------------
Given an array `nums` containing `n` distinct numbers in the range [0, n], 
return the one number that is missing from the array.

-----------------------------------
 Example Input/Output:
 -----------------------------------
Input: nums = [3,0,1]
Output: 2

Input: nums = [0,1]
Output: 2

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Input: nums = [0]
Output: 1

-----------------------------------
 Approach Explanation:
 -----------------------------------
1. Calculate the sum of all elements in the array.
2. Calculate the expected sum of numbers from 0 to n using the formula:
       total = n * (n + 1) / 2
3. The missing number = total - sum.

This works because the expected sum accounts for all numbers 0..n, 
and subtracting the actual sum gives the missing element.

-----------------------------------
 Time and Space Complexity:
 -----------------------------------
Time Complexity: O(n)  - One pass through the array.
Space Complexity: O(1) - Constant extra space.
-----------------------------------
*/

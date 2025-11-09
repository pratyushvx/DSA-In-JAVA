// File name: MaxConsecutiveOnes.java

public class MaxConsecutiveOnes {

    // Method to find the maximum number of consecutive 1s in a binary array
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxOnes = Math.max(maxOnes, count);
            } else {
                count = 0;
            }
        }
        return maxOnes;
    }

    // Main method with sample test cases
    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums1));
        // Expected: 3

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums2));
        // Expected: 2

        int[] nums3 = {0, 0, 0, 0};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums3));
        // Expected: 0

        int[] nums4 = {1, 1, 1, 1, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums4));
        // Expected: 5
    }
}

/*
-----------------------------------
 Problem Statement:
 -----------------------------------
Given a binary array nums, return the maximum number of consecutive 1s in the array.

-----------------------------------
 Example Input/Output:
 -----------------------------------
Input: nums = [1,1,0,1,1,1]
Output: 3

Input: nums = [1,0,1,1,0,1]
Output: 2

Input: nums = [0,0,0,0]
Output: 0

Input: nums = [1,1,1,1,1]
Output: 5

-----------------------------------
 Approach Explanation:
 -----------------------------------
1. Traverse the array while maintaining a counter `count` to track the 
   current streak of consecutive 1s.
2. Each time we encounter a 1, increment the counter and update the maximum streak `maxOnes`.
3. If a 0 is encountered, reset the counter to 0.
4. At the end, `maxOnes` holds the maximum consecutive 1s.

-----------------------------------
 Time and Space Complexity:
 -----------------------------------
Time Complexity: O(n)  - Traverse the array once.
Space Complexity: O(1) - Only a few integer variables are used.
-----------------------------------
*/

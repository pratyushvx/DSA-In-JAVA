// File: RemoveElement.java

public class removeElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;

        // Shift non-val elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        
        return count; // new length
    }

    public static void main(String[] args) {
        removeElement solution = new removeElement();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int len1 = solution.removeElement(nums1, 3);
        System.out.print("Test 1 Result: ");
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(" | New Length = " + len1);

        // Test case 2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int len2 = solution.removeElement(nums2, 2);
        System.out.print("Test 2 Result: ");
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println(" | New Length = " + len2);

        // Test case 3
        int[] nums3 = {1,1,1,1};
        int len3 = solution.removeElement(nums3, 1);
        System.out.print("Test 3 Result: ");
        for (int i = 0; i < len3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println(" | New Length = " + len3);

        // Test case 4
        int[] nums4 = {2,3,4,5};
        int len4 = solution.removeElement(nums4, 6);
        System.out.print("Test 4 Result: ");
        for (int i = 0; i < len4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println(" | New Length = " + len4);
    }
}


/*
Problem Statement:
------------------
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.
Return the new length of the array after removal.

You must do this in O(1) extra space.

Example Inputs/Outputs:
-----------------------
Input: nums = [3,2,2,3], val = 3
Output: [2,2], New Length = 2

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: [0,1,3,0,4], New Length = 5

Input: nums = [1,1,1,1], val = 1
Output: [], New Length = 0

Input: nums = [2,3,4,5], val = 6
Output: [2,3,4,5], New Length = 4

Approach Explanation:
----------------------
1. Maintain a pointer `count` to track the next index for valid (non-val) elements.
2. Iterate through the array:
   - If the current element is not equal to `val`, move it to index `count`.
   - Increment `count`.
3. After traversal, `count` represents the new length of the array.
4. Elements beyond index `count-1` are ignored.

Time Complexity:
----------------
O(n), where n = length of nums. Each element is checked once.

Space Complexity:
-----------------
O(1), as the removal is done in-place without using extra space.
*/
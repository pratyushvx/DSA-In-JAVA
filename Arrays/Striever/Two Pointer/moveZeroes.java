// File: MoveZeroes.java

class MoveZeroes {

    // Method to move all zeroes to the end while maintaining order of non-zero elements
    public void moveZeroes(int[] nums) {
        int count = 0;

        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        for (int j = count; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();

        int[] nums1 = {0, 1, 0, 3, 12};
        solver.moveZeroes(nums1);
        System.out.print("[0,1,0,3,12] → ");
        for (int num : nums1) System.out.print(num + " ");
        System.out.println();

        int[] nums2 = {0, 0, 1};
        solver.moveZeroes(nums2);
        System.out.print("[0,0,1] → ");
        for (int num : nums2) System.out.print(num + " ");
        System.out.println();

        int[] nums3 = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        solver.moveZeroes(nums3);
        System.out.print("[4,2,4,0,0,3,0,5,1,0] → ");
        for (int num : nums3) System.out.print(num + " ");
        System.out.println();

        int[] nums4 = {0};
        solver.moveZeroes(nums4);
        System.out.print("[0] → ");
        for (int num : nums4) System.out.print(num + " ");
        System.out.println();
    }
}

/*
Problem: Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0,0,1]
Output: [1,0,0]

Example 3:
Input: nums = [4,2,4,0,0,3,0,5,1,0]
Output: [4,2,4,3,5,1,0,0,0,0]

Approach:
- Use a two-pointer style method.
- Traverse the array and shift all non-zero elements to the front (keeping order).
- Then, fill the rest of the array with zeros.

Time Complexity: O(n), where n = nums.length
Space Complexity: O(1), since done in-place
*/

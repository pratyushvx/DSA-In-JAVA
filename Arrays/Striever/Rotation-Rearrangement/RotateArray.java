// File: RotateArray.java

class RotateArray {

    // Helper method to reverse part of the array
    public void rev(int nums[], int s, int e) {
        while (s <= e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    // Rotate array to the right by k steps
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k > n case

        // Step 1: Reverse whole array
        rev(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        rev(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        rev(nums, k, n - 1);
    }

    public static void main(String[] args) {
        RotateArray solver = new RotateArray();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        solver.rotate(nums1, 3);
        System.out.print("Rotated [1,2,3,4,5,6,7] by 3 → ");
        for (int num : nums1) System.out.print(num + " ");
        System.out.println();

        int[] nums2 = {-1, -100, 3, 99};
        solver.rotate(nums2, 2);
        System.out.print("Rotated [-1,-100,3,99] by 2 → ");
        for (int num : nums2) System.out.print(num + " ");
        System.out.println();

        int[] nums3 = {10, 20, 30, 40, 50};
        solver.rotate(nums3, 7);
        System.out.print("Rotated [10,20,30,40,50] by 7 → ");
        for (int num : nums3) System.out.print(num + " ");
        System.out.println();

        int[] nums4 = {1};
        solver.rotate(nums4, 5);
        System.out.print("Rotated [1] by 5 → ");
        for (int num : nums4) System.out.print(num + " ");
        System.out.println();
    }
}

/*
Problem: Rotate Array

Given an integer array nums, rotate the array to the right by k steps,
where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

Example 3:
Input: nums = [10,20,30,40,50], k = 7
Output: [40,50,10,20,30]

Approach:
- Use the reversal algorithm:
  1. Reverse the entire array.
  2. Reverse the first k elements.
  3. Reverse the last n-k elements.
- This rotates the array in-place without extra space.

Time Complexity: O(n), where n = nums.length
Space Complexity: O(1), constant extra space
*/

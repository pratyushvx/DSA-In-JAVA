// File name: SingleNumber.java

import java.util.HashMap;

public class SingleNumber {

    // Approach 1: Using HashMap (count frequencies)
    public int singleNumberHashMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1; // shouldn't happen
    }

    // Approach 2: Using XOR (optimal)
    public int singleNumberXOR(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    // Main method with test cases
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        int[] nums1 = {2, 2, 1};
        System.out.println("HashMap approach: " + solution.singleNumberHashMap(nums1));
        System.out.println("XOR approach: " + solution.singleNumberXOR(nums1));
        // Expected: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("HashMap approach: " + solution.singleNumberHashMap(nums2));
        System.out.println("XOR approach: " + solution.singleNumberXOR(nums2));
        // Expected: 4

        int[] nums3 = {1};
        System.out.println("HashMap approach: " + solution.singleNumberHashMap(nums3));
        System.out.println("XOR approach: " + solution.singleNumberXOR(nums3));
        // Expected: 1

        int[] nums4 = {7, 3, 5, 3, 5, 7, 9};
        System.out.println("HashMap approach: " + solution.singleNumberHashMap(nums4));
        System.out.println("XOR approach: " + solution.singleNumberXOR(nums4));
        // Expected: 9
    }
}

/*
-----------------------------------
 Problem Statement:
 -----------------------------------
Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one.

You must implement a solution with linear runtime complexity and use only constant extra space.

-----------------------------------
 Example Input/Output:
 -----------------------------------
Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4

Input: nums = [1]
Output: 1

-----------------------------------
 Approach Explanation:
 -----------------------------------
Approach 1 (HashMap):
1. Count the frequency of each number using a HashMap.
2. Return the number that appears exactly once.
- Time: O(n)
- Space: O(n)

Approach 2 (XOR Trick - Optimal):
1. XOR all numbers together.
2. Pairs of equal numbers cancel out (a ^ a = 0).
3. The result is the single number left.
- Time: O(n)
- Space: O(1)

-----------------------------------
 Time and Space Complexity:
 -----------------------------------
HashMap Approach:
- Time Complexity: O(n)
- Space Complexity: O(n)

XOR Approach:
- Time Complexity: O(n)
- Space Complexity: O(1)
-----------------------------------
*/

// File: UnionOfTwoSortedArrays.java

import java.util.*;

public class UnionOfTwoSortedArrays {

    // Function to find union of two sorted arrays
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicates in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                // both are equal
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        System.out.println("Union: " + findUnion(arr1, arr2));

        int[] arr3 = {1, 1, 1, 2, 2};
        int[] arr4 = {2, 3, 4};
        System.out.println("Union: " + findUnion(arr3, arr4));

        int[] arr5 = {5, 10, 15};
        int[] arr6 = {3, 6, 9, 12, 15};
        System.out.println("Union: " + findUnion(arr5, arr6));

        int[] arr7 = {1, 2, 3};
        int[] arr8 = {4, 5, 6};
        System.out.println("Union: " + findUnion(arr7, arr8));
    }
}

/*
========================================
Problem Statement:
Given two sorted arrays arr1 and arr2 of sizes n and m, 
find the union of the two sorted arrays.
The union is defined as the set of common and distinct elements in both arrays. 
The result must be in ascending order.

----------------------------------------
Example Input/Output:
Input: arr1 = [1, 2, 2, 3, 4, 5], arr2 = [2, 3, 5, 6]
Output: [1, 2, 3, 4, 5, 6]

Input: arr1 = [1, 1, 1, 2, 2], arr2 = [2, 3, 4]
Output: [1, 2, 3, 4]

----------------------------------------
Approach:
- Since both arrays are sorted, use a two-pointer technique.
- Traverse both arrays simultaneously.
- Compare elements:
  - If arr1[i] < arr2[j], add arr1[i] and move i.
  - If arr1[i] > arr2[j], add arr2[j] and move j.
  - If equal, add once and move both pointers.
- Skip duplicates to maintain uniqueness.
- Add remaining elements of both arrays.
- Result will be in sorted order naturally.

----------------------------------------
Time Complexity:
O(n + m) → Each element of both arrays is processed once.

Space Complexity:
O(n + m) in the worst case (if all elements are unique).
========================================
*/

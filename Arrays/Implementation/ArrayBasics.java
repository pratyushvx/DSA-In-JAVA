package Implementation;
// ArrayBasics.java
// Demonstrating basic array operations: creation, traversal, insertion, deletion

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // Step 1: Create array
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Step 2: Traversal
        System.out.print("Traversal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 3: Insertion at index 2
        int insertIndex = 2;
        int newValue = 99;
        arr[insertIndex] = newValue; // replaces element
        System.out.println("After Insertion at index 2: " + Arrays.toString(arr));

        // Step 4: Deletion (simulate by shifting elements left)
        int deleteIndex = 3;
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; // clear last slot
        System.out.println("After Deletion at index 3: " + Arrays.toString(arr));
    }
}

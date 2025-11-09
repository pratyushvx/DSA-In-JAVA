class SortedRotated {
    public boolean check(int[] nums) {
        int count = 0;

        // Count descents in the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }

        // Check wrap-around condition
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        // Valid rotated sorted array if at most one descent
        return count <= 1;
    }

    public static void main(String[] args) {
        SortedRotated sr = new SortedRotated();

        int[] arr1 = {3, 4, 5, 1, 2};   // Rotated sorted
        int[] arr2 = {2, 1, 3, 4};      // Not rotated sorted
        int[] arr3 = {1, 2, 3, 4, 5};   // Sorted (valid)

        System.out.println(sr.check(arr1)); // true
        System.out.println(sr.check(arr2)); // false
        System.out.println(sr.check(arr3)); // true
    }
}

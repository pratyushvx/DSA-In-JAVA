//Combination sum 2 
import java.util.*;

public class R16 {
    public static void find(Set<List<Integer>> result, List<Integer> temp, int[] nums, int n, int i, int sum, int target) {
        if (i > n) {
            if (sum == target) {
                result.add(new ArrayList<>(temp)); // Corrected type
            }
            return;
        }

        // Include the current element
        temp.add(nums[i]);
        find(result, temp, nums, n, i + 1, sum + nums[i], target);
        temp.remove(temp.size() - 1);

        // Exclude the current element
        find(result, temp, nums, n, i + 1, sum, target);
    }
    public static void combination(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>(); // Corrected type
        List<Integer> temp = new ArrayList<>();
        find(result, temp, nums, n, 0, 0, 8);
        System.out.println(result);
    }

    public static void main(String[] args) {
        int nums[] = {10, 1, 2, 7, 6, 1, 5};
        combination(nums);
    }
}

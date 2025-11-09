import java.util.*;

public class a {
    public static int minimizeDifference(List<Integer> arr, int k) {
        int n = arr.size();
        
        // Sort the array
        Collections.sort(arr);
        
        // Initial difference between max and min values in the sorted array
        int initialDiff = arr.get(n - 1) - arr.get(0);
        
        // New difference after adding/subtracting k
        int a=arr.get(n - 1) - k;
        int b=arr.get(0) + k;
        int newDiff = (arr.get(n - 1) - k) - (arr.get(0) + k);
        arr.set(0,b);
        arr.set(n-1,a);
        // Adjust the elements in the array based on the new difference
        for (int i = 1; i < n-1; i++) {
            if (arr.get(i) < b) {
                arr.set(i, arr.get(i) - k);
            } else if(arr.get(i)<b) {
                arr.set(i, arr.get(i) + k);
            }
        }
        
        // Sort the array again to get the updated min and max values
        Collections.sort(arr);
        
        // Return the minimized difference
        return arr.get(n - 1) - arr.get(0);
    }

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 3, 11, 17, 18, 24, 26, 30, 30, 33, 33, 38, 39, 40, 61, 64, 65, 76, 79, 80, 82, 84, 84, 87, 88, 93, 97, 99));
        List<Integer> arr = Arrays.asList(0, 1, 3, 11, 17, 18, 24, 26, 30, 30, 33, 33, 38, 39, 40, 61, 64, 65, 76, 79, 80, 82, 84, 84, 87, 88, 93, 97, 99);

        int k = 44;
       
        int result = minimizeDifference(arr, k);
        System.out.println("Minimized difference: " + result);
        System.out.println(arr);
    }
}

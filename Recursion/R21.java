import java.util.*;
public class R21 {
    public static void permutation(int[] nums,List<int[]> result,int i){
    if(i==nums.length){
        result.add(nums.clone());
    }
    for(int j=i;j<nums.length;j++){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        permutation(nums, result, i+1);
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
    public static void Sol(int []nums){
    List<int[]> result=new ArrayList<>();
    permutation(nums,result,0);
    for (int[] perm : result) {
        System.out.print(Arrays.toString(perm));
    }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        Sol(nums);

    }
}

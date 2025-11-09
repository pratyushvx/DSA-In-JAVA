//Combination Sum -1
//print all subsequences
import java.util.LinkedList;
import java.util.List;

public class R15 {
    public static List<List<Integer>> find(List<List<Integer>> result,List<Integer> temp,int[] nums,int n,int i,int sum,int target){
    if(i>n){
        if(sum==target){
            result.add(new LinkedList<>(temp));
        }
        return result;
    }  
    if(sum>target){
        return result;
    }
    temp.add(nums[i]);
    sum+=nums[i];
    find(result,temp,nums,n,i,sum,target);
    temp.remove(temp.size()-1);
    sum-=nums[i];
    find(result,temp,nums,n,i+1,sum,target);
    return result;
    }
    public static void combination(int[] nums){
    int n=nums.length-1;
    List<List<Integer>> result=new LinkedList<>();
    List<Integer> temp=new LinkedList<>();
    find(result,temp,nums,n,0,0,7);
    System.out.println(result);
   
    }
    public static void main(String[] args) {
       int nums[]={2,3,6,7};
       combination(nums);

    }
}


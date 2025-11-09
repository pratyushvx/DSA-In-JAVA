//print all subsequences
import java.util.LinkedList;
import java.util.List;

public class R14 {
    public static List<List<Integer>> find(List<List<Integer>> result,List<Integer> temp,int[] nums,int n,int i,int sum,int target){
    if(i>n){
        if(sum==target){
        result.add(new LinkedList<>(temp));
        }
        return result;
    }   
    temp.add(nums[i]);
    sum+=nums[i];
    find(result,temp,nums,n,i+1,sum,target);
    temp.remove(temp.size()-1);
    sum-=nums[i];
    find(result,temp,nums,n,i+1,sum,target);
    return result;
    }
    public static void sub_sequence(int[] nums){
    int n=nums.length-1;
    List<List<Integer>> result=new LinkedList<>();
    List<Integer> temp=new LinkedList<>();
    find(result,temp,nums,n,0,0,3);
    System.out.println(result);
   
    }
    public static void main(String[] args) {
       int nums[]={3,1,2};
       sub_sequence(nums);

    }
}

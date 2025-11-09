import java.util.*;

class Solution {
    public void find(int[] candidates,int target,List<List<Integer>> result,List<Integer> temp,int i){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            if(i>j && candidates[j]==candidates[j-1]) continue;
            if(candidates[j]>target) break;
            temp.add(candidates[j]);
            find(candidates,target-candidates[j],result,temp,j+1);
            temp.remove(temp.size()-1);
            }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(candidates, target, result, temp, 0);
        return result;
    }
}

public class R17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = solution.combinationSum2(candidates, target);
        
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.print(combination+" ");
        }
    }
}
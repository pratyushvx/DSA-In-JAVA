//Combination Sum - 3
import java.util.*;
public class R18 {
    public void find(int k,int n,int[] arr,int i,List<List<Integer>> result,List<Integer> temp){
        if((temp.size())==k){
            if(n==0){
        result.add(new ArrayList<>(temp));
            }
        return;
        }
        if(i>=9) return;
    temp.add(arr[i]);
    find(k,n-arr[i],arr,i+1,result,temp);
    temp.remove(temp.size()-1);
    find(k,n,arr,i+1,result,temp);
}
    public void combination3(int k,int n){
    List<List<Integer>> result =new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    int arr[]={1,2,3,4,5,6,7,8,9};
    find(k,n,arr,0,result,temp);
    System.out.println(result);
    }
    public static void main(String[] args) {
        R18 r=new R18();
        int k=3,n=9;
    r.combination3(k,n);
    }
}

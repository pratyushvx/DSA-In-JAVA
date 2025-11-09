import java.util.*;
public class R20 {
    public static void permutation(int []arr,List<Integer> temp,List<List<Integer>> result,int i,boolean[] check){
    if(i==arr.length){
        result.add(new ArrayList<>(temp));
        return;
    }
    
        for(int j=0;j<arr.length;j++){
            if(check[j]==true) continue;
            temp.add(arr[j]);
            check[j]=true;
            permutation(arr,temp,result,i+1,check);
            temp.remove(temp.size()-1);
            check[j]=false;
        }
    
    
    }
    public static void sol(int[] arr){
    boolean[] check = new boolean[arr.length];
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    permutation(arr,temp,result,0,check);
    System.out.println(result);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        sol(arr);
    }
}

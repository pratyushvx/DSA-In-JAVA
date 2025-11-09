import java.util.*;
public class concept {
    public static void main(String[] args) {
        int arr[]={90,2,3,4,2,3,5,1,2,4,5,6,7,8,9,1};
        Map<Integer,Integer> count=new TreeMap<>();
        for(int i:arr){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for(int i:count.keySet()){
            System.out.println(i+" "+count.get(i));
        }
    }
}

import java.util.HashMap;
import java.util.*;
class hashmap_majority{
    public static void main(String[] args) {
        int a[]={1,2,3,1,4,5,1,1,3,2};
        //Q-> Find the occurance of number using HashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            // if(map.containsKey(a[i])){
            // map.put(a[i],map.get(a[i])+1);
            // continue;
            // }
            // map.put(a[i],1);
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
        }
        System.out.println(map);
        // for(int i=1;i<map.size();i++){
        // if(map.get(i)>a.length/3){
        //     System.out.println(map.get(i));
        // }
        // }
        //Set<Integer> key=map.keySet();
        for(int s:map.keySet()){
        if(map.get(s)>a.length/3){
            System.out.println(s);
        }
        }

       
    }

}
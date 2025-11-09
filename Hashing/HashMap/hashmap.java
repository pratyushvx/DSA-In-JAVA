import java.util.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Samosa",15);
        map.put("Chai",12);
        map.put("Cold-drink",20);
        map.put("Gold-Flake",10);
        System.out.println(map);
        // System.out.println(map.get("Samosa"));
        map.remove("Gold-Flake");
        System.out.println(map);
    //     System.out.println(map.keySet());
    //     System.out.println(map.values());
    //    System.out.println( map.containsValue(15));
    //Iteration on Hashmap
    Set<String> key=map.keySet();
    for( String s:key){
        System.out.print(" Key:"+s+",Value:"+map.get(s)+" ");
    }
    System.out.println(map.keySet());


    }
    
}

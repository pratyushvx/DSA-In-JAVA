import java.util.ArrayList;
public class alo3 {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(1);
        al.add(1,3);
        al.add(1,2);
        System.out.println(al);
        int a=al.get(1);
        System.out.println(a);  
        al.set(1,5);
        System.out.println(al);     

    }
    
}

import java.util.*;
public class arraylist {
    public static int duplicate(ArrayList<Integer> list){
        Collections.sort(list);//if we implement sort fn in this function then,whole ArrayList will reflect same changes
    for(int i=1;i<list.size();i++){
    if(list.get(i-1)==list.get(i)){
        return i;
    }
   
    }
    return -1;
    }
    public static void print(ArrayList<Integer> list){
        System.out.println(list);
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        int n=list.size();
        for(int i=0;i<n/2;i++){
            int temp=list.get(n-i-1);
            list.set(n-i-1,list.get(i));
            list.set(i,temp);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            list.add(a);
        }
        System.out.println("duplicate element is :"+duplicate(list));
        reverse(list);
        print(list);

    }
    
}

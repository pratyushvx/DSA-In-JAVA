import java.util.*;
public class s2{
    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     String s=sc.next();
     
     for(int i=0;i<s.length()/2;i++){
        int j=s.length()-1-i;
        if(s.charAt(i)==s.charAt(j)){
            continue;
        }
        else{
            System.out.println("Not pallindrome");
            return;
        }
        
     }
     System.out.println("pallindrome");
        return;
    }
}
import java.util.*;
public class lon_prefix {
    public static void main(String[] args) {
        String str[] = {"flower", "flow", "floght"};
        StringBuilder sb=new StringBuilder();
        
        Arrays.sort(str);
        System.out.println(str[0]);
        int i=0;
        for(i=0;i<str[0].length();i++){
            if(str[0].charAt(i)==str[str.length-1].charAt(i)){
                continue;
            }
            else{
                break;
            }
        }
        System.out.println(str[0].substring(0,i));

    }
}

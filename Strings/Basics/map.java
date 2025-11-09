import java.util.*;
public class map {
    public static void finder(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'E':
                x++;
                break;
                case 'W':
                x--;
                break;
                case 'N':
                y++;
                break;
                case 'S':
                y--;
                break;
            }
            
        }
        // System.out.println(x+""+y);
        int x2=x*x;
            int y2=y*y;
            float shortest=(float)Math.sqrt(x2+y2);
            System.out.println(shortest);
    }
    public static void main(String args[]){
        String s="WNEENESENNN";
        finder(s);

    }
    
}

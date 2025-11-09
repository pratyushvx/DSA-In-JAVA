import java.util.*;
public class reverse_word {
    public static void main(String[] args) {
        String s="the sky is blue";
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
              list.add(i);
            }
        }
        list.add(s.length());
        System.out.println(list);
        int count=list.size()-1;
        int x=list.get(count); 
        while(count>-1){
            int y=list.get(count--);
            String temp=s.substring(y,x);
            System.out.print(" ");
            System.out.print(temp);
            x=y;
        }
        


            }
    }


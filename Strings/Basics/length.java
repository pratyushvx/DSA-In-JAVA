import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class length {
    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            count++;
        }
        System.out.println("No of words in String is :"+count);
    //concatenate two string
    String first,last;
    System.out.println("Enter two String ");
    first=sc.next();
    last=sc.next();
    String full=first+" "+last;
    System.out.println(full);

    
    //reverse the string 
    String rev="";
    for(int i=a.length()-1;i>=0;i--){
    rev+=a.charAt(i);
    }
    System.out.println(rev);
    
    String str="Pratyush";
    StringBuilder sb=new StringBuilder(str.length());
    for(int i=0;i<str.length()/2;i++){
        sb.append(str.charAt(i));
    }
}
    
}

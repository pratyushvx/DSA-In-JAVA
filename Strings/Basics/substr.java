public class substr {
    public static void main(String[] args) {
        String s="ankit";
        //System.out.println(s.substring(0,s.length()-2)); 
        String substr="";
        for(int i=0;i<s.length();i++){
            substr+=s.charAt(i);
            System.out.print(substr+" ");

        }
        System.out.println();
        for(int i=1;i<=s.length();i++){
            System.out.print(s.substring(0,i)+" ");
        }
    
    
    
    }
    
}

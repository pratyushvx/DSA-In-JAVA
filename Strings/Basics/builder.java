public class builder {
    public static void main(String args[]){
        StringBuilder s=new StringBuilder();
        s.append("hi");
        s.append(" I am Pratyush");
        s.insert(2,"i");
        s.replace(0,3,"Hey");
        s.delete(0,4);
        //s.reverse();
        int a=s.capacity();
        a=s.length();
        System.out.println(s.charAt(5));
        System.out.println(s);
        System.out.println(a);
    }
    
}

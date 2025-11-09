public class print {
    public static void qprint(int n){
    if(n<1){
        return;
    }
    System.out.println(n+" Hello Using Recursion");
    qprint(--n);
    }
    public static void main(String args[]){
        qprint(5);
    }
    
}

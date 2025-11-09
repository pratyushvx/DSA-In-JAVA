//Print from N to 1
public class R03 {
    public static void print(int n) {
     if(n<1) return;
     System.out.println(n);
     print(--n);   
    }
    public static void main(String[] args) {
      print(10);  
    }
}

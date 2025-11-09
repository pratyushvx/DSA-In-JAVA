//Print from 1 To N 
public class R02 {
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(++i,n);//post increment should not used
    }
    public static void main(String args[]){
    int n=10;
    print(1,n);
    }
    
}

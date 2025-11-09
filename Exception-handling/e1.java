import java.util.Scanner;
public class e1 {
    public static void main(String args[]){
        int a[]=new int[4];
        Scanner sc=new Scanner(System.in);
        a[2]=sc.nextInt();
        System.out.println("Value of 2th index is :"+a[2]);

        try{
            a[21]=sc.nextInt();//this line will run then the exception will occur
            System.out.println(a[21]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception Handled");
            System.out.println(e);
        }finally{
         a[2+1]=sc.nextInt();
         System.out.println(a[3]);
        }
        System.out.println("eNd of the C0de");
        sc.close();


    }
    
}

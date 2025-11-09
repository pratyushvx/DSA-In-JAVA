//Reverse Array using Recursion
public class R09 {
    public static void rev(int a[],int n,int i){
        if(i==n/2) return;
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
        rev(a,n,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rev(a,a.length,0);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}

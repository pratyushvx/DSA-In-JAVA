public class MERGESORT {
    public static void sort(int[] a,int s,int l){
        if(s>=l){
            return;
        }
        int mid=(s+l)/2;
        sort(a,s,mid);
        sort(a,mid+1,l);
        merge(a,s,mid,l);
    }
    public static void merge(int a[],int s,int mid,int l) {
        int front=s;
        int rear=mid+1;
        int i=0;
        int[] temp=new int[s+l+1];
        while(front<=mid && rear<=l){
            if(a[front]<=a[rear]){
                temp[i]=a[front];
                i++;
                front++;
            }
            else{
                temp[i]=a[rear];
                i++;
                rear++;
            }
        }
        while(front<=mid){
            temp[i]=a[front];
                i++;
                front++;
        }
        while(rear<=l){
            temp[i]=a[rear];
            i++;
            rear++;
        }
        i=0;
        for(int m=s;m<=l;m++){
            a[m]=temp[i];
            i++;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={6,3,4,2,1,7,8};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}

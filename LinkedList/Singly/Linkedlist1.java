class Linkedlist1{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public   Node head=null;
    public   Node tail=null;
    public  void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Linkedlist1 add(Linkedlist1 l,Linkedlist1 lm){
    Node t1=l.head;
    Node t2=lm.head;
    int carry=0;
    Linkedlist1 lt=new Linkedlist1();
      while(t1!=null || t2!=null){
        int sum=carry;
        if(t1!=null){
            sum=sum+t1.data;
            t1=t1.next;
        }
        if(t2!=null){
            sum+=t2.data;
            t2=t2.next;
        }
        lt.insert(sum%10);
        carry=sum/10;


    }
    if(carry>0){
        lt.insert(carry);
    }
    return lt;
    }
    public static void main(String args[]){
        Linkedlist1 l=new Linkedlist1();
        Linkedlist1 lm=new Linkedlist1();
        l.insert(5);
        l.insert(4);
        l.insert(1);
        lm.insert(9);
        lm.insert(2);
        lm.insert(6);
        lm.print();
        l.print();
        Linkedlist1 lt=Linkedlist1.add(l,lm);
        System.out.println();
        lt.print();
        
    }

    }

public class e
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]=new int[6];
		try{
		    System.out.println(a[-1]);
		}catch(Exception e){
		    System.out.println("Exception handled");
		    System.out.println(e);
		}
		System.out.println("After code");
	}
}

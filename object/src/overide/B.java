package overide;

public class B
{
public static void main(String[] args)
{
	
	A a1=new A(18);
	A a2=new A(12);
	A a3=new A(18);
	System.out.println(a1==a3);
	System.out.println(a1.equals(a3));
	System.out.println(a1.equals(a2));
	
	Runtime.getRuntime().gc();
	System.gc();
}
}


public class B 
{
public static void main(String[] args)
{
	A a1=new A();
	System.out.println(a1.test1());
	a1.test2(10);
	System.out.println(a1.test1());
	System.out.println("----");

	A a2=new A();
	System.out.println(a2.test1());
	}
}

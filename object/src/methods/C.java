package methods;

public class C implements Cloneable
{
	public static void main(String[] args) throws Throwable
	{
		C c1=new C();
	
		System.out.println(c1.clone());
		System.out.println(c1.equals(c1));
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
		System.out.println(c1.getClass());
		c1.finalize();
		System.out.println();
		System.out.println(c1 instanceof Object);
	}
	}


package with_instiliser;

public class B {
	static int i=test(); static int test(){System.out.println("B test");return 0;}
	B()
	{
	System.out.println("B()");
	
	}
	
	static{
		System.out.println("B SIB");
	}
	{
		System.out.println("B IIB");
	}
}


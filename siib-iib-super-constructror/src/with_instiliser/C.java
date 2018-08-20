package with_instiliser;

public class C extends B{
	static int i=test1(); static int test1(){System.out.println("C test1");return 0;}

	C()
		{
			System.out.println("C()");
		
		}
			
		static{
			System.out.println("C SIB");
		}
		{
			System.out.println("C IIB");
		}
	}

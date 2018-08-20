package with_instiliser;

public class D extends C{
	static{
		System.out.println("D SIB");
	}
	static int i=test2(); static int test2(){System.out.println("D test2");return 0;}

		D()
		{
			super();
		System.out.println("D()");
				}
				
		
		{
			System.out.println("D IIB");
		}
		
	}

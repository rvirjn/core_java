
public class B extends A
{
	
void test3(){System.out.println("test3");}
void test4(){System.out.println("test4");}

public static void main(String[] args)
{
	 
	A a2 = new B();
	a2.test1();
	a2.test2();
	//a2.test3();
	//a2.test4();

	B a1=(B)new A();//actually this casting gives RTE
	System.out.println("run time exception");
	a1.test1();
	a1.test2();
	a1.test3();
	a1.test4();
	
	
}
}

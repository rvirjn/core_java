package Annonimus_inner_class;

public class main
{
public static void main(String args[])
{
	A a1=new A(){
		public void test1(){System.out.println("new test1");}
		
	};
	B b1=new B(){
		void test2(){System.out.println("new test2");}
	};
	C c1=new C(){void test4(){System.out.println("new test4");}};
	
	
	
	b1.test2();
	c1.test3();
}
}

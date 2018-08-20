package local_inner_class;

public class A
{
	void test(){
				 class B{
					int j=2;
					void test(){}
				}
	B b1=new B();//here only we can create object 
	System.out.println(b1.j);
	b1.test();
	//b1.j; also valid for in noramal class
	}
 
	static void test1(){
				class C{
					int i=3;
		
				} }
public static void main(String[] args)
{

	
}

}

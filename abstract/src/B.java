
public class B extends A
{
 public void test(){}
 public void test1(){}
 B()
 {
	 this(12);
 }
B(int i){
	//this();
}
public static void main(String[] args)
{
	B b1=new B();
	b1.i=10;
	System.out.println(b1.i);
}
}


public class A
{
int i;

static void test2(A a1){
	
	a1.i=20;
	
}
static void test1(int x){
	A a1=new A();
	a1.i=10;
}
public static void main(String[] args)
{
	A a1=new A();
	a1.i=30;
	System.out.println(a1.i);
	test1(a1.i);
	System.out.println(a1.i);
	test2(a1);
	System.out.println(a1.i);
	
}
}

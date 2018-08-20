
public class B
{
int i;//try with static int i;
void test(B x){
	System.out.println(i);
	System.out.println(x.i);
	x.i=i;
	System.out.println(i);
	System.out.println(x.i);
	
		
}
public static void main(String[] args)
{
	B b1=new B();
	B b2=new B();
	b1.i=10;
	b2.i=20;
	b1.test(b2);
	System.out.println(b1.i);
	System.out.println(b2.i);
	//System.out.println("---");
	//b1.i=10;
	//b2.i=20;
	//b2.test(b1);
	//System.out.println(b1.i);
	//System.out.println(b2.i);
	//System.out.println("---");
	
}
}


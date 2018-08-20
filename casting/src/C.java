
public class C extends B
{
public static void main(String[] args)
{
	
	B b1=new C(); 
	System.out.println(b1 instanceof C);
	A a1=new C();
	B b2=(B)a1;//downcasting tvi possiable h jb uska member usme aviable h
	C c1=(C)b2;
	System.out.println(b2 instanceof C );
	
	
}
}

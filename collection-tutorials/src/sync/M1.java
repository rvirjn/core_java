package sync;

public class M1
{
	public static void main(String[] args)
	{
		A a1=new A();
		A2 a2=new A2(a1);
		A3 a3=new A3(a1);
		
		a2.start();
		a3.start();
	}

}

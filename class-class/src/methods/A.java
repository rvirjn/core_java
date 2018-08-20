package methods;
import java.lang.reflect.Method;

public class A 
{
	A(){
		System.out.println("contructer");
	}

	public static void main(String[] args) throws Throwable
	{
		
		
		Class c2=Class.forName("methods.A");
	//	A b1=(A)c2.newInstance();
		
		Method[] m1=c2.getMethods();
		System.out.println(m1);
		Method[] m2=c2.getDeclaredMethods();
		System.out.println(m2);
		
		Method m3=c2.getMethod("hashCode");
		
		System.out.println(m3.getName());
		Method m4=c2.getDeclaredMethod("test");
		System.out.println(m4.getName());
		
	
		
	}
	public void test(){
		System.out.println(" calling of test");
	}

}

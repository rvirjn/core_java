package error;

import java.lang.reflect.Method;

public class A {
	static void test(){test();}static void test2(){test();}
public static void main(String[] args) {
		
	try{
		System.out.println("-----StackOverflowError------");
		A.test();
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}
	try{
		System.out.println("-------OutOfMemoryError----");
		int[] i=new int[99999999];
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("----NoSuchMethodError----");
		A a1=new A();
		Class a2=a1.getClass();
		Method m = a2.getMethod("");
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}
	System.out.println("success");
}
}
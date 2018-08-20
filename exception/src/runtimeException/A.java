package runtimeException;

public class A {
void test(){System.out.println("test");}
public static void main(String[] args) {
		try{	
			System.out.println("--ArithmeticException-");
			int i=10/0;
			}
				catch(Throwable ex){
					System.out.println(ex);
									}
	try{	
		System.out.println("--NullPointerException----");
		A a1=null;
		a1.test();
		}
			catch(Throwable ex){
				System.out.println(ex);
								}
	try{
		System.out.println("--NumberFormatException-----");
		String s1="abc";
		System.out.println(Integer.parseInt(s1));
		}
			catch(Throwable ex){
				System.out.println(ex);
							}
	try{
		System.out.println("--StringIndexOutOfBoundsException----");
		String s1="abc";
		System.out.println(s1.charAt(3));
		}
			catch(Throwable ex){
				System.out.println(ex);
					}
	try{
		System.out.println("--ArrayIndexOutOfBoundsException----");
	int[] i={1,2,3};
	System.out.println(i[3]);
		}
			catch(Throwable ex){
				System.out.println(ex);
							}
	try{
		System.out.println("--ClassCastException------");
		A a1=(A) new Object();
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}
	
System.out.println("success");
}
}

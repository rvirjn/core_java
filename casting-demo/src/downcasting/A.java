package downcasting;

public class A {
	static void test(Object c1){
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof A);
		System.out.println(c1 instanceof B);
		System.out.println(c1 instanceof C);

	}
public static void main(String[] args) {
	A a1=new C();
	test(a1);
	
 
}

}

package downcasting2;

public class Main {
public static void main(String[] args) {
	A a1=new B();
	B b1=(B)a1;
	System.out.println(b1.i);
	System.out.println(b1.j);
}
}

package methods;

public class A 
{
	public String toString(){ return "calling of A class Tostring its return refercene memory address inobject class but here we are overiding and returning this sentence";}
public static void main(String[] args)
{
	A a2=new A();
	System.out.println(a2);
	
}
}




public class A
{
	static int i=test();
	static int j=2;
		
	static int test2(){return 3;}
	
	static int test()
	{
		System.out.println(" i m in test");
		System.out.println(j);//why 0 ? 2 na// 
		System.out.println(i); //   recursion na ?// 	
		System.out.println(test2());//why not 0 or null//
		return 1;
}
	
	public static void main(String[] args)
	{
		System.out.println("i m in main");
		System.out.println(i);
		System.out.println(j);
		}
	
}

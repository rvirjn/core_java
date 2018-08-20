
class B
{
	class C{
		 int i=80;
			}
	
	static class D{
		static int j=90;
		
					}
	
	
	public  static   void main(String[] args)
	{
		
					D d1=new D();//D d2=new B.D();
					System.out.println(d1.j);
					
					B b1=new B();
					C c1=b1.new C();
					System.out.println(c1.i);
		
	}
	
}
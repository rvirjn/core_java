
public enum A
{
	con1(100),con2(200),con3;
	static int j;
	int k;
	A(){
		System.out.println("without ags cons");}
	A(int i){
		//this();
		System.out.println("ags cons");
			}
	void test1(){System.out.println("non static test");}
	{System.out.println("iib");}
	static void test(){System.out.println("static test");}
	static{System.out.println("sib");}
	public static void main(String[] args)
	{
		
	}
	}

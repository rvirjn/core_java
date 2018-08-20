class D{
 enum B
{
con1(100),con2(200),con3;
static int j;
int k;
B(){
	System.out.println("without ags cons");}
B(int i){
	//this();
	System.out.println("ags cons");
		}
void test1(){System.out.println("non static test");}
{System.out.println("iib");}
static void test(){System.out.println("static test");}
static{System.out.println("sib");}
}
 
public static void main(String[] args)
{

	B b1=B.con2;
	//System.out.println(b1);
	//System.out.println(B.j);
	//B.test();
	//B b2=B.con2;

	//b1.test1();


}
}

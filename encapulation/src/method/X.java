package method;

public class X
{
	private int test1(){
		return 1;
	} 
int test2(){
	return test1();
}
void  test3(int k){
	//test1()=k;
}
}

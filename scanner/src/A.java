import java.util.Scanner; 
class A 
{
	
	 
int test(){
	System.out.println("enter one int");
	Scanner a=new Scanner(System.in);
	int  i=a.nextInt();
	return i;	
	}

String test1(){
	System.out.println("enter  one string ");
	Scanner a=new Scanner(System.in);
	String name=a.nextLine();
	return name;
}
int [] test2(){
	System.out.println("enter five integer");
	Scanner a=new Scanner(System.in);
	int[] numbers = new int[5]; 
	for (int i = 0; i < numbers.length; i++) {
		numbers[i]=a.nextInt();
	}
	return null;	
	}
String[] test3(){
	System.out.println("enter five names");
	Scanner a=new Scanner(System.in);
	String[] names = new String[5]; 
	for (int i = 0; i < names.length; i++) {
		names[i]=a.nextLine();
	}
	return null;	
	}

public static void main(String[] args)
{
	A a1 =new A();
	System.out.println("test1="+a1.test3()+"       " +"test2="+a1.test1());
}
 
}
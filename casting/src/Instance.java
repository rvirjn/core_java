
public class Instance
{
public static void main(String[] args)
{
	B a1=new C();
	B a2=a1;
System.out.println(a1 instanceof C);//to check weather all member of C class is available in a1 or not
System.out.println(a2 instanceof C);
}

}

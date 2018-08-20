package lara;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class A
{

	A(){System.out.println("construter");}
public static void main(String[] args)throws IOException
{
	ArrayList l1=new ArrayList();
	Integer[] a={1,2,3};  
	System.out.println(a);
	//int[] a={1,2,3};
	
	l1.add(a);
	System.out.println(l1);
	
	ArrayList l2=new ArrayList();
	Collections.addAll(l2,a);
	System.out.println(l1);
	
	ArrayList l3=new ArrayList(Arrays.asList(a));
	System.out.println(l3);
	
	
}
}

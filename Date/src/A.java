import java.util.*;
public class A
{
public static void main(String[] args)
{
	Date d1=new Date();
	System.out.println(d1);
	
	Date d2=new Date(0);
	System.out.println(d2);
	
	Calendar c1=Calendar.getInstance();
	Date d5=c1.getTime();
	System.out.println(d5);
	
	c1.add(Calendar.DATE, 1);
	Date d3=c1.getTime();
	
	System.out.println(d3);
	
}
}

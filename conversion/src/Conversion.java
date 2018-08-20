import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class Conversion
{
public static void main(String[] args)
{
	int i=3;
	Integer j=Integer.valueOf(i);//boxing
	int k=j.intValue();//unboxing
	
	String s1=Integer.toString(i);//int into string// Integer cuz args is int/integer type//anyting into string
	
	int l=Integer.parseInt(s1);//string into int //jisme convert krna h uska wapper class.parseInt
	
	char c[]=s1.toCharArray();//string into char array..
	
	//primitive char arrays into String
	
	char[] c1={'a','b','c','d','f','c','v','v'};
	String s2=new String(c1);
	System.out.println(s2);
	
	
	
	Integer[] array1={1,3,4};
	ArrayList<Integer> l2= new ArrayList<Integer>(Arrays.asList(array1));// arrays into arrayList
	
	//or these but this will not print content
		ArrayList<Integer> l1= new ArrayList<Integer>();// arrays into arrayList
		Collections.addAll(l1,array1);
		
		
		
		 Integer[] array2 = l2.toArray(new Integer[l2.size()]);// ArrayList into arrays
		 System.out.println(Arrays.toString(array2));
		
		 //String into util date.. 
		 try
		{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String dateString="04-11-1991";
		java.util.Date utilDate = sdf.parse(dateString);
		} catch (ParseException e){}
			
		
		 //util date into sql date
		java.util.Date d1 = new java.util.Date();
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
}
}

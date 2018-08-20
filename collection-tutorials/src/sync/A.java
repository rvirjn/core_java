package sync;

import java.util.ArrayList;
import java.util.Collections;

public class A 
{
	int i=0;
	ArrayList l1=new ArrayList();
	
	A(){
	//Collections.synchronizedList(l1);
	}
	 void test1()
	{
		
		//System.out.println("A test1 above a1=="+i);
		synchronized (l1) {
		for(; i <= 500; i++){
			l1.add(i);
			System.out.println("A test1 below a1=="+l1.get(i));
		}
		}
	}
	
	 void test2()
	{
		//System.out.println("A test2 above a1=="+i);
		 synchronized (l1) {
		for(; i <= 1000; i++){
			l1.add(i);
			System.out.println("A test2 below a1=="+l1.get(i));
		}}
	}
}

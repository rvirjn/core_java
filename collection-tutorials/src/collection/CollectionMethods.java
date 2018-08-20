package collection;
import java.util.*;
public class CollectionMethods extends Thread
{
	int i=0;
	static ArrayList l1;
public static void main(String[] args)
{
	l1=new ArrayList();
	l1.add(10);l1.add(170);l1.add(101);l1.add(1000);l1.add(1);l1.add(8);l1.add(7);
	Collections.sort(l1);	
	System.out.println(l1);
	System.out.println(Collections.max(l1));
	System.out.println(Collections.min(l1));
	System.out.println(Collections.binarySearch(l1, 1));
	//Collections.synchronizedList(l1);
	
	CollectionMethods c1=new CollectionMethods();
	Thread t1=new Thread(c1);
	t1.start();
	Thread t2=new Thread(c1);
	t2.start();
	
	

}
public void run(){
for(int i=0;i<100;i++){
	l1.add(i);
}
System.out.println(l1);
}
}

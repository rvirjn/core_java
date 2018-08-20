package rst;
public class Using_runable extends Thread
{
	int i=0;
public  void run(){
	Thread t1=Thread.currentThread();

	System.out.println("===========run======"+t1.getName());
		System.out.println("run method       "+t1.getName()+"==="+i);
	test();
	
}
synchronized void test(){
	Thread t1=Thread.currentThread();
	System.out.println("=======test=========="+t1.getName());
	for (;i<1000;i++){
		System.out.println("test method"+t1.getName()+"==="+i);
	}
	test2();
	
	
}
synchronized void test2(){
	Thread t1=Thread.currentThread();
	System.out.println("==========test2======="+t1.getName());
	for (;i<2000;i++){
		System.out.println("test2 method   "+t1.getName()+"==="+i);
	}
}
}


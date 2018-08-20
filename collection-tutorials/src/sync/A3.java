package sync;

public class A3 extends Thread
{
	A a1;
A3(A a1){
	this.a1=a1;
}	

@Override
public void run(){

	System.out.println("A3 run  above=="+this.getName()+" "+a1.i);
	a1.test2();
	System.out.println("A3 run below==="+this.getName()+" "+a1.i);
}

}

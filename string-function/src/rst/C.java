package rst;

public class C
{
	public static void main(String[] args){
		Using_runable a1= new Using_runable();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		//good example of sync two thred will run not sumiltinouly
		t2.start();
		t1.start();
	}
}

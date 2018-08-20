package sync;

public class DemoClass
{
    public synchronized void demoMethod(){}

 
 //or
 

    public void demoMethod1(){
        synchronized (this)
        {
            //other thread safe code
        }
    }

    private final Object lock = new Object();
    public void demoMethod2(){
        synchronized (lock)
        {
            //other thread safe code
        }
    }
}

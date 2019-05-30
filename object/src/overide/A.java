package overide;

class A
{
	int i;
	A(int i){
		this.i=i;
	}
public String toString(){
	String s1=Integer.toString(i);
	return s1;
}
	
	@Override
public boolean equals(Object obj){
		
	boolean flag=((A)obj).i==this.i;
	return flag;
}
public int hashCode(){
	
	String s1=Integer.toString(i);
	int hashcode=s1.hashCode();
	return hashcode;
}
@Override
protected void finalize() throws Throwable {
        try{
            System.out.println("Inside Finalize() method of Sub Class : A");
            }
        catch(Throwable t){
            throw t;
            }
        finally{
            System.out.println("Calling finalize() method of Super Class:  Object");
            super.finalize();
        }
}
public static void main(String[] args) throws Throwable
{
	A a1 = new A(1);
	Runtime.getRuntime().gc();
	System.gc();
	a1.finalize();
}
	
}


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
}


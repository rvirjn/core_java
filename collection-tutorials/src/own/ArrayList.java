package own;

public class ArrayList{ 
	int size,capacity=5;
	Object[] ar;
ArrayList()	{
	ar=new Object[capacity];
	}

public String toString(){
	StringBuffer s1= new StringBuffer();
	
	for(int i=0;i<=size;i++)
	{
		s1.append(" ");
	s1.append(ar[i]);
	}
	return s1.substring(0, 16);
	}
public void add(Object obj){
	ar[size++]=obj;
		
		
		if(size==capacity){
			Object[] tmp=ar;
			ar=new Object[capacity*2];
			for(int i=0;i<=size-1;i++)
				{
				ar[i]=tmp[i];
				}
	}
	
	}
//public String getInt(int i){
//	return s1.substring(i,i);
//}
}

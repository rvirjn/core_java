/**
     *our own ArrayList class  
     */
package ds;

public class ArrayList
{
private Object[] elements;
private int size,capacity;
ArrayList(){
	capacity=10;
	elements=new Object[capacity];
}
void add(Object obj){
	if(size==capacity){
		increaseCpacity();
	}
	else{ elements[size++]=obj;}
}
 void increaseCpacity()
{
	Object[] temp=elements;
	capacity=capacity*2;
	elements=new Object[capacity];
	for(int i=0;i<size;i++){
		elements[i]=temp[i];
	}}
Object get(int index){
	if(index<0|| index>=size){
		throw new IndexOutOfBoundsException("index be between o and size");
	}
	return elements[index];
}
public int size(){
	return size;
}

public String toString(){
	StringBuffer sb=new StringBuffer("[");
	for(int i=0;i<size;i++){
	sb.append(elements[i]+",");}
	return sb.substring(0,sb.length()-1)+"]";
	
}
public static void main(String[] args)
{
	ArrayList l1=new ArrayList();
	l1.add(1);
	l1.add("ravi");
	System.out.println(l1);
	System.out.println(l1.get(0));
}
}

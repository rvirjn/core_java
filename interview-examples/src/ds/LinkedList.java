/**
     *Implementation of our own linked list 
     */
package ds;

//import java.util.*;


public class LinkedList
{
	private Link head;
	
	LinkedList(){head=null;}
public boolean IsEmpty(){
	return head==null;
}
public void insert(Object data){
	Link newLink=new Link(data);
	newLink.next=head;
	head=newLink;
}
public boolean delete(){
	if(head==null) {return false;}
	else{ head=head.next; return true;}
}
public void print(){
	Link current=head;
	while(current!=null){
		System.out.print(" "+current.getData());
		current=current.next;
	}
}
public static void main(String[] args)
{
	LinkedList l1=new LinkedList();
	l1.insert(1);
	l1.insert("ravi");
	l1.insert(2);
	l1.insert(3);
	System.out.println(l1.delete());
	l1.print();
}

}
class Link{
	private Object data;
	public Link next;
	Link(Object data){
		this.data=data;
	}
	public Object getData()
	{
		return data;
	}
	
}
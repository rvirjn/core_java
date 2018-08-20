/**
     * Implementation of our own Queue Class
     */
package ds;

public class Queue
{
private int[] object;
private int front;
private int rear;
private int queueSize;

Queue(){
	queueSize=3;
	object=new int[queueSize];
	front=-1;
	rear=-1;
}
void push(int data){
	if((front+1)>=queueSize){resize();}
}
 void resize()
{
	 int [] temp=object;
	 queueSize=queueSize*2;
		object=new int[queueSize];
		
		for(int i=0;i<=front;i++){
			object[i]=temp[i];
		}
}
Integer pop(){
	if(front>rear){return object[++rear];}
	else{ return null;}
}
boolean isEmpty(){
	return front<=rear;
}
}

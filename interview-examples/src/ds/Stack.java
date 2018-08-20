/**
     * Implementation of our own Stack Class
     */
package ds;

public class Stack
{
private int[] object;
private int top;
private int stackSize;
Stack(){
	stackSize=1;
	top=-1;
	object=new int[stackSize];
}
void push(int iteam){
	if(top>=stackSize-1){resize();}
}
Integer pop(){
	if(top<0){return null;}
	else{ return object[top--];}
}
 void resize()
{
	int [] temp=object;
	stackSize=stackSize*2;
	object=new int[stackSize];
	
	for(int i=0;i<=top;i++){
		object[i]=temp[i];
	}
}
}

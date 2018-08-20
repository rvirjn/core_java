package methods;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class B
{
public static void main(String[] args)throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException
{
	A a2=new A();
	Class c2=a2.getClass();
	Class c1=Class.forName("methods.A");
	//Class c3=A.class;


	Method[] m2=c1.getDeclaredMethods();
	for(Method m1:m2){
		System.out.println(m1);
		
	}	
	
	A a3=(A)c1.newInstance();//A a4=(A)c2.newInstance();A a5=(A)c3.newInstance();
	Method m3=c1.getDeclaredMethod("test");
	m3.invoke(a3);
	
	A a4=(A)(Object)c2.newInstance();//A a5=(A)c3.newInstance();
	Method m4=c2.getDeclaredMethod("test");
	m3.invoke(a3);
	
}}


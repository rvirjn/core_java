package compileTimeException;

import java.io.FileWriter;
import java.sql.DriverManager;
import java.text.DateFormat;

public class A {
public static void main(String[] args) {
	try{
		System.out.println("------ClassNotFoundException-----");
		Class.forName("java.lang.Sttring");
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("------SQLException----");
		DriverManager.getConnection("");
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("------IoException-------");
		new FileWriter("");
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("----CloneNotSupportedException------");
		A a1=new A();
		a1.clone();
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("----IntruptedException-----");
		Thread.sleep(100);
		
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
	try{
		System.out.println("-----ParseException-----");
		DateFormat a1=DateFormat.getDateInstance();
		a1.parse("");
		}
			catch(Throwable ex){	
				System.out.println(ex);
					}	
System.out.println("success");
}

}

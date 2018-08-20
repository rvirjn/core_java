package sqlQueries;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class A {
public static void main(String[] args)throws Exception {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	Connection con = DriverManager.getConnection("jdbc:odbc:dsn1","system","great12345");
	
	Statement stmt = con.createStatement();
	
	stmt.execute("create table employee(sno int, firstName varchar(90), lastName varchar(90), age int)");
	String s1[]={"insert into employee values(1,'ravi','ranjan',20)","insert into employee values(1,'ravi','ranjan',20)"};
	for(String s:s1){
	stmt.execute(s);
	}
	String s3="select * from employee";
	ResultSet rs=stmt.executeQuery(s3);
	while(rs.next()){
	System.out.print(rs.getInt(1));
	System.out.print(" "+rs.getString(2));
	System.out.print(" "+rs.getString(3));
	System.out.println(" "+rs.getInt(4));
	}
	System.out.println("Wel Done");
}
}

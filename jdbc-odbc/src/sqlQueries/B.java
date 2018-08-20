package sqlQueries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class B {

	public static void main(String[] args)throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:dsn1","system","great12345");
		Statement stmt = con.createStatement();
		FileReader f1=new FileReader("text1.txt");
		BufferedReader b1=new BufferedReader(f1);
		String sr=b1.readLine();
		while (sr!=null)
		{
		String[] s5=sr.split(",");
		String s1="insert into employee values("+s5[0].trim()+",'"+s5[1].trim()+"','"+s5[2].trim()+"',"+s5[3].trim()+")";
		stmt.execute(s1);
		sr=b1.readLine();
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

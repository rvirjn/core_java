package sqlQueries;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Set;

public class C {

	public static void main(String[] args)throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:dsn1","system","great12345");
		Statement stmt = con.createStatement();
		
		Properties pr=new Properties();
		FileReader f1=new FileReader("test2.properties");
		pr.load(f1);
		Set<String>k1=pr.stringPropertyNames();
		for(String s2 : k1)
		{
			String s5=pr.getProperty(s2);
			stmt.execute(s5);
		}
	}
}

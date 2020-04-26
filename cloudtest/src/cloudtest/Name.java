package cloudtest;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Name {
static String name;

public static String getName() {
	return name;
}

public void setName(String name) {
	Name.name = name;
}
public String execute(){
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement st = (Statement) con.createStatement();
		st.executeUpdate("insert into name values('"+ name +"')");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "1";

}
}

package viswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
  Class.forName("com.mysql.cj.jdbc.Driver");
  
  Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");
  
Statement statement = connection.createStatement();

ResultSet result=statement.executeQuery("SELECT * FROM `employee_details`");

while(result.next()) {

System.out.println(result.getString(1));


	}

}
}

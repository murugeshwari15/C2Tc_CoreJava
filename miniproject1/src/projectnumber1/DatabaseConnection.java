package projectnumber1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
	 public static Connection getConnection() throws SQLException
	   {
		   String url="jdbc:mysql://localhost:3306/project1";
		   String username="root";
		   String password="mu@15";
		   Connection con=DriverManager.getConnection(url,username,password);
		   return con;
	   }
}

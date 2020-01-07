import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
public static void main(String[] args) {

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","delnex4d","pass");
		System.out.println("connected");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

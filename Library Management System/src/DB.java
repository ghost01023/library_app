import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con = null;
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","1234");
			System.out.println("Accessed database.");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static void main(String [] args) {
		System.out.println("Inside the first main function.\n");
		getConnection();
		System.out.println("Success!");
	}

}

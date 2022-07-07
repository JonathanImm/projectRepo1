package learning;

import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;


public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver" + "howard"); 
		//To read class extension.class
		
		String url = "jdbc:mysql://localhost:3306/kampus";
		String username = "root";
		String password = "???";
		
				
	}

}

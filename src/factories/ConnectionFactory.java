package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() throws Exception {
		
		var host = "jdbc:mysql://localhost:3308/projetoaula06";
		var user = "user";
		var pass = "coti";
		
		return DriverManager.getConnection(host, user, pass);
		
	}

}

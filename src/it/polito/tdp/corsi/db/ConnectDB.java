package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	private static final String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?useTimezone=true&serverTimezone=UTC&user=root&password=valegio23";
	
	public static Connection getConnection() { //ritorna una connessione al chiamante
		
		Connection conn;
		
		try {
			
		     conn=DriverManager.getConnection(jdbcURL);
			
			
		}catch (SQLException e) {
			
			System.out.println("Errore connessione al DB");
			throw new RuntimeException(e);
		}
		
		return conn;
	}
	
}

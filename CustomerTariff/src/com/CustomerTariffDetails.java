package com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerTariffDetails{
	static Connection con=null;
	public static Connection getConection() throws
	ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		con=DriverManager.getConnection(url,"system","manager");
		return con;
	}
	public static void closeConnection() throws ClassNotFoundException,
	SQLException {
		if(con!=null)
			con.close();
	}
	

}

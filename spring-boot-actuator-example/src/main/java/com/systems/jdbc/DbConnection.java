package com.systems.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    Connection dbConnection = null;
    	
    String dbName = "jdbc:mysql://localhost:3306/emails?useSSL=false";//serverTimeZone=UTC";//?useSSL=false
    String userName = "root"; 
    String password = "Systems@2021";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       dbConnection = DriverManager.getConnection(dbName,userName,password);
       System.out.println(dbConnection);
       return dbConnection;
    }
	

	
}

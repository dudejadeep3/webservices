package com.course.webservices.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.course.webservices.constants.DatabaseConstants;
import com.course.webservices.exception.SystemException;
import com.course.webservices.utils.Utils;

public abstract class BaseDao {

	private static Connection connection;
	private static Properties properties;
	
	static{
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=getDatabaseConnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new SystemException("Error in finding the driver class");
		}
	}
	
	public void closeConnection(){
		if(!Utils.isEmpty(connection)){
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SystemException("Error in closing the datbase connection");
			}
		}
	}
	
	public void closeStatement(Statement statement){
		if(!Utils.isEmpty(statement)){
			try {
				statement.close();
			} catch (SQLException e) {
				throw new SystemException("Error in closing the sql statement");
			}
		}
	}
	
	
	public void closePreparedStatement(PreparedStatement preparedStatement){
		if(!Utils.isEmpty(preparedStatement)){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					throw new SystemException("Error in closing the prepared statement");
				}
		}
	}
	public Connection getConnection(){
		return connection;
	}
	
	public static Connection getDatabaseConnection() throws SQLException{
		if(Utils.isEmpty(properties)){
			setProperties();
		}
		String username=properties.getProperty(DatabaseConstants.DATABASE_USERNAME);
		String password= properties.getProperty(DatabaseConstants.DATABASE_PASSWORD);
		String url = properties.getProperty(DatabaseConstants.DATABASE_URL);
		String databaseName=properties.getProperty(DatabaseConstants.DATABASE_NAME);
		return DriverManager.getConnection(url+databaseName, username, password);
	}
	
	public static void setProperties(){
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();           
			InputStream stream = loader.getResourceAsStream(DatabaseConstants.CONFIG_FILE_PATH);
			 properties = new Properties();
			 properties.load(stream);
		} catch (IOException e) {
			throw new SystemException("Error in getting the database properties");
		}  
	}
	
	
}

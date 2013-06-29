package main.java.bg.fmi.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private String url = "jdbc:mysql://localhost:3306/FoodsDB";
	private String user = "root";
	private String password = "root";

	public MySQLAccess() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String readDataBase(String foodName)  {
				try {
			Queries queryToDB = new Queries();
			return resultSetToString(queryToDB.search(connect, foodName));
		} catch (Exception e) {
			e.printStackTrace();
			return new String();
		} 
	}

	private String resultSetToString(ResultSet resultSet)
			throws SQLException {
		char separator =';';
			
		StringBuilder builder = new StringBuilder();
		int columnCount = resultSet.getMetaData().getColumnCount();
		resultSet.beforeFirst();
		while (resultSet.next()) {
			  for (int i = 0; i < columnCount;) {
		        builder.append(resultSet.getString(i + 1));
		        if (++i < columnCount) builder.append(separator);
		    }
		}
		return builder.toString();
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

}
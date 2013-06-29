package main.java.bg.fmi.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Queries {
	private PreparedStatement preparedStatement = null;

	private static String SQL_SELECT_SEARCH = "select * from FoodsDB.FoodsTable where FoodName=?";

	public ResultSet search(Connection connection, String foodName)
			throws SQLException {
		preparedStatement = connection.prepareStatement(SQL_SELECT_SEARCH);
		preparedStatement.setString(1, foodName);
		return preparedStatement.executeQuery();
	}
}

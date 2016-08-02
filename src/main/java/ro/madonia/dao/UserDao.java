package ro.madonia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ro.madonia.entities.User;
import ro.madonia.service.TransactionManager;

public class UserDao {
	public User getUserByUsername(String username) throws SQLException {

		User user = null;
		Connection connection = TransactionManager.getInstance().getConnection();

		String str = "select * from users where username=?";
		// String str = String.format("select username, password from user where
		// username = %s", userName);

		PreparedStatement statement;

		statement = connection.prepareStatement(str);
		statement.setString(1, username);
		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			user = new User(rs.getString("username"), rs.getString("pass"));
			// System.out.println("user from db: " + uname);
		} else {
			System.out.println("userdao user not found " + username);
		}

		return user;
	}
}

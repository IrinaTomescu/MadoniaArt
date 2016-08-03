package ro.madonia.WebZ.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionManager {
	private static TransactionManager instance = null;
	private static ThreadLocal<Connection> thLoc = new ThreadLocal<>();

	private TransactionManager() {

	}

	public static TransactionManager getInstance() {
		if (instance == null) {
			instance = new TransactionManager();
		}
		return instance;
	}

	public void beginTransaction() {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
			throw new RuntimeException("Cannot load driver", e1);
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madonia", "root", "root");
			connection.setAutoCommit(false);
			thLoc.set(connection);

		} catch (SQLException sqe) {
			throw new RuntimeException("Cannot connect to DB", sqe);
		}
		
		System.out.println("beginTransaction() finished ok");
	}

	public void commit() {
		try {
			thLoc.get().commit();

		} catch (SQLException e) {
			throw new RuntimeException("Cannot commit", e);
		}
	}

	public void rollback() {
		try {
			thLoc.get().rollback();

		} catch (SQLException e) {
			throw new RuntimeException("Cannot rollback", e);
		}
	}

	public void disconnect(){
		try {
			thLoc.get().close();
			thLoc.remove();
		} catch (SQLException e) {
		}
		
	}
	
	public Connection getConnection() {
		return thLoc.get();

	}
}

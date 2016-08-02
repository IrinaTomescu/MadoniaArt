package ro.madonia.service;

import ro.madonia.dao.UserDao;
import ro.madonia.entities.User;
import ro.madonia.service.TransactionManager;

/**
 * Created by irina on 7/28/2016.
 */
public class LoginService {

	public User doLogin(String userName, String password) {
System.out.println("started doLogin()");
		

		try {
			TransactionManager.getInstance().beginTransaction();
			System.out.println("started doLogin()");
			UserDao userDAO = new UserDao();
			User user = userDAO.getUserByUsername(userName);

			if (user == null) {
				System.out.println("doLogin user==null");
				return null;
			}else
			{
				System.out.println("doLogin() read user " + user.getUsername());
			}
			if (!password.equals(user.getPassword())) {
				System.out.println("doLogin PASSWORD WRONG");
				return null;
			}
			TransactionManager.getInstance().commit();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			TransactionManager.getInstance().rollback();
			return null;
		} finally {
			TransactionManager.getInstance().disconnect();
		}
	}
}

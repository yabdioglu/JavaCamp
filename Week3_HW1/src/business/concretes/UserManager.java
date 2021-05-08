package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
		
	}
	
	public boolean getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public void confirmEmail(String message) {
		System.out.println(message + " isimli eposta adresiniz doðrulandý.");
		
	}

	@Override
	public User getByEmailandPassword(String email, String password) {
		return userDao.getByEmailandPassword(email, password);
	}
	
	
	

}

package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserDaoManager implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println( user.getFirstName() +"isimli kullanýcýnýn bilgileri güncellendi.");
		
	}

	@Override
	public void remove(User user) {
		users.remove(user);
		
	}
	
	public boolean getByEmail(String email) {
		for (User user : users) {
			if(user.geteMail().equals(email)) {
				return false;
			}
		}
		return true;
	}
	
	public User getByEmailandPassword(String email, String password) {
		for (User user : users) {
			if (user.geteMail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
	

}

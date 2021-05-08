package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void remove(User user);
	boolean getByEmail(String email);
	public User getByEmailandPassword(String email, String password);
}

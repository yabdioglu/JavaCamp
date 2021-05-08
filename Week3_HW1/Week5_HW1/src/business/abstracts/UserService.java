package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void remove(User user);
	boolean getByEmail(String email);
	void confirmEmail(String message);
	public User getByEmailandPassword(String email, String password);
}

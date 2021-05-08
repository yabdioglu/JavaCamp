package oopHomework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " user added");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " user updated");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " user deleted");
	}

}

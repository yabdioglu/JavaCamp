package oopHomework2;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " student added");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " student updated");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " student deleted");
	}
}

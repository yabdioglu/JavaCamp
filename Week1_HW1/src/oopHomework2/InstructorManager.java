package oopHomework2;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " instructor added");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " instructor updated");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " instructor deleted");
	}

}

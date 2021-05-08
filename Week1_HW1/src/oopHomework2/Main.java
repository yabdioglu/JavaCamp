package oopHomework2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Mert","Balkan", "mrb123");
		Instructor instructor1 = new Instructor(1, "Yavuz", "Top�u", "123456", 1, "Siber G�venlik");
		Student student1 = new Student(1, "Mehmet", "Ta�", "154646", "Java �dev1");
		
		User[] users = {user1, instructor1, student1};
		
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
			

		UserManager userManager1 = new UserManager();
		InstructorManager instructorManager1 = new InstructorManager();
		StudentManager studentManager1 = new StudentManager();
		
		instructorManager1.add(instructor1);
		studentManager1.add(student1);
		userManager1.add(user1);
		
		
		

	}

}

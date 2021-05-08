package googleAuth;

import entities.concretes.User;

public class GoogleAuth {
	public void register(User user) {
		System.out.println(user.getFirstName() + " hesabý google ile kayýt edildi.");
	}
}

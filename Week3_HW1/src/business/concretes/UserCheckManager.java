package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import core.ValidationRules;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean check(User user) {
		boolean result = ValidationRules.run(checkEmail(user.geteMail()),
				checkFirstName(user.getFirstName()),
				checkLastName(user.getLastName()),
				checkPassword(user.getPassword())
						);
		return result;
	}

	public boolean checkEmail(String email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email).find();
	}
	
	public boolean checkFirstName(String firstName) {
		return firstName.length() >= 2;
	}
	
	public boolean checkLastName(String lastName) {
		return lastName.length() >= 2;
	}
	
	public boolean checkPassword(String password) {
		return password.length() >= 6;
	}
	
	
}

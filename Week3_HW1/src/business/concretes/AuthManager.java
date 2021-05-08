package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import entities.concretes.User;

public class AuthManager implements AuthService {

	UserCheckService userCheckService;
	EmailService emailService;
	UserService userService;
	
	
	public AuthManager(UserCheckService userCheckService, EmailService emailService, UserService userService) {
		super();
		this.userCheckService = userCheckService;
		this.emailService = emailService;
		this.userService = userService;
	}



	@Override
	public void register(User user) {
		if(!userCheckService.check(user)) {
			System.out.println("Kay�t i�lemi ba�ar�s�z.L�tfen bilgilerinizi kontrol ediniz.");
			return;
		}
		if(!userService.getByEmail(user.geteMail())) {
			System.out.println("Kay�t i�lemi ba�ar�s�z.Bu eposta adresi kullan�lm��, l�tfen ba�ka bir eposta adresi giriniz.");
			return;
		}
		System.out.println("Kay�t ba�ar�yla tamamland�.L�tfen eposta adresinizden hesab�n�z� do�rulay�n�z.");
		emailService.send(user.geteMail());
		userService.add(user);
	}



	@Override
	public void login(String email, String password) {
		User userToLogin = userService.getByEmailandPassword(email, password);
		
		if (!checkMailandPassword(email, password)) {
			System.out.println("Giri� ba�ar�s�z, eksik bilgi girdiniz.");
			return;
		}
		if (userToLogin == null) {
			System.out.println("Eposta adresi veya �ifre yanl��, L�tfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Ba�ar�yla giri� yap�ld�: " + userToLogin.getFirstName() );
		
		
	}
	
	public boolean checkMailandPassword(String email, String password) {
		if(email.length() < 0 && password.length() < 0) {
			return false;
		}
		return true;
	}

}

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
			System.out.println("Kayýt iþlemi baþarýsýz.Lütfen bilgilerinizi kontrol ediniz.");
			return;
		}
		if(!userService.getByEmail(user.geteMail())) {
			System.out.println("Kayýt iþlemi baþarýsýz.Bu eposta adresi kullanýlmýþ, lütfen baþka bir eposta adresi giriniz.");
			return;
		}
		System.out.println("Kayýt baþarýyla tamamlandý.Lütfen eposta adresinizden hesabýnýzý doðrulayýnýz.");
		emailService.send(user.geteMail());
		userService.add(user);
	}



	@Override
	public void login(String email, String password) {
		User userToLogin = userService.getByEmailandPassword(email, password);
		
		if (!checkMailandPassword(email, password)) {
			System.out.println("Giriþ baþarýsýz, eksik bilgi girdiniz.");
			return;
		}
		if (userToLogin == null) {
			System.out.println("Eposta adresi veya þifre yanlýþ, Lütfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Baþarýyla giriþ yapýldý: " + userToLogin.getFirstName() );
		
		
	}
	
	public boolean checkMailandPassword(String email, String password) {
		if(email.length() < 0 && password.length() < 0) {
			return false;
		}
		return true;
	}

}

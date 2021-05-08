import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.MyAuthService;
import core.adapters.MyAuthAdapter;
import dataAccess.concretes.UserDaoManager;
import entities.concretes.User;
import googleAuth.GoogleAuth;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new UserDaoManager());
		AuthService authService = new AuthManager(new UserCheckManager(), new EmailManager(), userService);
		MyAuthService myAuthService = new MyAuthAdapter(new GoogleAuth());
		
		User user1 = new User(1, "Yýldýray", "Abdioðlu", "yldryabdgl@gmail.com", "165445");
		authService.register(user1);
		userService.confirmEmail(user1.geteMail());
		authService.login("yldryabdgl@gmail.com", "165445");
		
		myAuthService.register(user1);
		

	}

}

package core.adapters;

import core.MyAuthService;
import entities.concretes.User;
import googleAuth.GoogleAuth;

public class MyAuthAdapter implements MyAuthService {

	GoogleAuth googleAuth;
	
	public MyAuthAdapter(GoogleAuth googleAuth) {
		this.googleAuth = googleAuth;
	}
	
	@Override
	public void register(User user) {
		googleAuth.register(user);
	}
	

}

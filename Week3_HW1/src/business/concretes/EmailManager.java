package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String to) {
		System.out.println("Do�rulama mesaj� " + to + " isimli E-posta adresine g�nderildi.L�tfen E-posta'n�z� kontrol ediniz.");
	}

	
	
	

}

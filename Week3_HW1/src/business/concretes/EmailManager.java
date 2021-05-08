package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String to) {
		System.out.println("Doðrulama mesajý " + to + " isimli E-posta adresine gönderildi.Lütfen E-posta'nýzý kontrol ediniz.");
	}

	
	
	

}

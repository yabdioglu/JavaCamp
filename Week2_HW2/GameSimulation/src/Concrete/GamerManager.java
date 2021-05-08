package Concrete;
import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	
	@Override
	public void add(Gamer gamer) {
		
		if ( GamerCheckManager.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu ba�ar�yla kay�t edildi.");
		}else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu kay�t edilemedi!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncunun bilgileri g�ncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncunun kayd� silindi.");
	}


	

}

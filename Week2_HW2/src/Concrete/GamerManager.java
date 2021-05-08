package Concrete;
import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	
	@Override
	public void add(Gamer gamer) {
		
		if ( GamerCheckManager.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu baþarýyla kayýt edildi.");
		}else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu kayýt edilemedi!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncunun bilgileri güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncunun kaydý silindi.");
	}


	

}

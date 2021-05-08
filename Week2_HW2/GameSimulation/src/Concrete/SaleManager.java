package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getId() + " id numaras�na sahip  " + game.getName() + " isimli oyun " + gamer.getFirstName() + " isimli oyuncu taraf�ndan " + game.getPrice() + " TL'ye sat�n al�nd�.");
		
	}
	
	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getId() + " id numaras�na sahip  " + game.getName() + " isimli oyun " + gamer.getFirstName() + " isimli oyuncu taraf�ndan " 
				+ campaign.getName() + " kampanyas�ndan faydalanarak " + game.getPrice() + " TL yerine " + 
				campaign.getDiscount(game.getPrice()) + " TL'ye sat�n al�nd�.");
		
	}

}

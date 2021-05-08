package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getId() + " id numarasýna sahip  " + game.getName() + " isimli oyun " + gamer.getFirstName() + " isimli oyuncu tarafýndan " + game.getPrice() + " TL'ye satýn alýndý.");
		
	}
	
	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getId() + " id numarasýna sahip  " + game.getName() + " isimli oyun " + gamer.getFirstName() + " isimli oyuncu tarafýndan " 
				+ campaign.getName() + " kampanyasýndan faydalanarak " + game.getPrice() + " TL yerine " + 
				campaign.getDiscount(game.getPrice()) + " TL'ye satýn alýndý.");
		
	}

}

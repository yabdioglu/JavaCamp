package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " id numarasýna sahip  " + game.getName() + " isimli oyun sisteme kaydedildi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " id numarasýna sahip " + game.getName() + " isimli oyun bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " id numarasýna sahip " + game.getName() + " isimli oyun sistemden kaydý silindi.");
		
	}

}

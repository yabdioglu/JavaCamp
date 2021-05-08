package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " id numaras�na sahip  " + game.getName() + " isimli oyun sisteme kaydedildi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " id numaras�na sahip " + game.getName() + " isimli oyun bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " id numaras�na sahip " + game.getName() + " isimli oyun sistemden kayd� silindi.");
		
	}

}

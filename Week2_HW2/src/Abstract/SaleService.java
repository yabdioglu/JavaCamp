package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface SaleService {
	void sale(Gamer gamer, Game game);

	void sale(Gamer gamer, Game game, Campaign campaign);
}

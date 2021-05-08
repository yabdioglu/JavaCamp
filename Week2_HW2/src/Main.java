import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("Yýldýray", "Abdioðlu", "3213651", 2002);
		Gamer gamer2 = new Gamer("Hüseyin", "Taþcý", "2134646", 1991);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer2);
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		System.out.println(" ");
		
		Game game1 = new Game(1, "Football Manager 2021", "Futbol Menajerlik", "24 Kasým 2020", 249);
		Game game2 = new Game(2, "CyberPunk 2077", "Rol yapma", "17 Eylül 2020", 249);
		Game game3 = new Game(3, "PUBG", "Hayatta kalma savaþý ", "21 Aralýk 2017", 43.5);
		Game game4 = new Game(4, "PES 2021", "Futbol", "15 Eylül 2020", 21.45);
		Game game5 = new Game(5, "Forza Horizon 4", "Araba yarýþý", "9 Mart 2021", 92);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.add(game5);
		
		System.out.println("");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, game5);
		saleManager.sale(gamer1, game4);
		
		System.out.println("");
		
		Campaign campaign1 = new Campaign(1, "Cadýlar Bayramý Ýndirimi", 20);
		Campaign campaign2 = new Campaign(2, "Bahar Ýndirimi", 15);
		Campaign campaign3 = new Campaign(3, "Kýþ Ýndirimi", 25);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign3);
		campaignManager.update(campaign3);
		campaignManager.delete(campaign3);
		
		System.out.println("");
		
		saleManager.sale(gamer1, game5, campaign1);
		saleManager.sale(gamer1, game3, campaign2);
		

	}

}

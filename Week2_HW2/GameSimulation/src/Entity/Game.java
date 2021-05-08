package Entity;

public class Game {
	private int id;
	private String name;
	private String details;
	private String relaceDate;
	private double price;
	
	public Game(int id, String name, String details, String relaceDate, double price) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.relaceDate = relaceDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getRelaceDate() {
		return relaceDate;
	}

	public void setRelaceDate(String relaceDate) {
		this.relaceDate = relaceDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}

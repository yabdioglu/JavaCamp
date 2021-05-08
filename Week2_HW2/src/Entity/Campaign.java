package Entity;

public class Campaign {
	private int id;
	private String name;
	private double discountRate;
	
	public Campaign(int id, String name, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public double getDiscount(double gamePrice) {
		return gamePrice - (gamePrice * discountRate / 100);
	}
	
	

}

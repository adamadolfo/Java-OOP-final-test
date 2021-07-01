
public class Hamburger {
	private String name;
	private Bread bread;
	private Meat meat;
	private Cheese cheese;
	private Lettuce lettuce;
	private Tomato tomato;
	private Condiment condiment;
	private double basePrice;
	public Hamburger(String name, Bread bread, Meat meat) {
		this.name = name;
		this.bread = bread;
		this.meat = meat;
		this.basePrice = 10.00;
	}
	
	
	
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}



	public void setLettuce(Lettuce lettuce) {
		this.lettuce = lettuce;
	}



	public void setTomato(Tomato tomato) {
		this.tomato = tomato;
	}



	public void setCondiment(Condiment condiment) {
		this.condiment = condiment;
	}



	
	
	public double calculatePrice() {
		System.out.println("calculating price of base burger...");
		double total = this.basePrice + this.meat.getMeatPrice() + this.bread.getBreadPrice();
		System.out.println("price of hamburger with meat and roll is: " + total);
		
		if (this.cheese != null) {
			System.out.println("Adding " + this.cheese.name + " for " + this.cheese.getCheesePrice());
			total += this.cheese.getCheesePrice();
		}
		
		if (this.lettuce != null) {
			System.out.println("Adding " + this.lettuce.name + " for " + this.lettuce.getLettucePrice());
			total += this.lettuce.getLettucePrice();
		}
		
		if (this.tomato != null) {
			System.out.println("Adding " + this.tomato.name + " for " + this.tomato.getTomatoPrice());
			total += this.tomato.getTomatoPrice();
		}
		
		if (this.condiment != null) {
			System.out.println("Adding " + this.condiment.name + " for " + this.condiment.getCondimentPrice());
			total += this.condiment.getCondimentPrice();
		}
		
		return total;
	}
	
	
	
	
	
	
}

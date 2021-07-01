
public class DeluxHamburger extends Hamburger {
	private String name;
	private Bread bread;
	private Meat meat;
	private Chip chip;
	private Drink drink;
	
	
	public DeluxHamburger(String name, Bread bread, Meat meat, Chip chip, Drink drink) {
		super(name, bread, meat);
		
		this.chip = chip;
		this.drink = drink;
		
	}
	
	
	public double calculatePrice() {
		double total = super.calculatePrice() +  this.chip.getChipPrice() + this.drink.getDrinkPrice();
	
		System.out.println("Calculating Delux meal... The base price of your burger is: " + super.calculatePrice() + ". The price of " + this.chip.getName() + " is: " + this.chip.getChipPrice() + ". The price of " + this.drink.getName() + " is: " + this.drink.getDrinkPrice() + ". The total is: " + total + ".");
		
		return total;
	}
	
	
}

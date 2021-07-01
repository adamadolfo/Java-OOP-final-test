
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
	
	
	
	
	@Override
	public void setCheese(Cheese cheese) {
		// TODO Auto-generated method stub
	  System.out.println("Cannot add to delux burger");
	}




	@Override
	public void setLettuce(Lettuce lettuce) {
		// TODO Auto-generated method stub
		 System.out.println("Cannot add to delux burger");
	}




	@Override
	public void setTomato(Tomato tomato) {
		// TODO Auto-generated method stub
		 System.out.println("Cannot add to delux burger");
	}




	@Override
	public void setCondiment(Condiment condiment) {
		// TODO Auto-generated method stub
		 System.out.println("Cannot add to delux burger");
	}




	public double calculatePrice() {
		double total = super.calculatePrice() +  this.chip.getChipPrice() + this.drink.getDrinkPrice();
	
		System.out.println("Calculating Delux meal... The base price of your burger is: " + super.calculatePrice() + ". The price of " + this.chip.getName() + " is: " + this.chip.getChipPrice() + ". The price of " + this.drink.getName() + " is: " + this.drink.getDrinkPrice() + ". The total is: " + total + ".");
		
		return total;
	}
	
	
}

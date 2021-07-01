
public class HealthyBurger extends Hamburger{
	

	private Spinach spinach;
	private Mushroom mushroom;


	public HealthyBurger( Bread bread, Meat meat) {
		super("healthy", bread, meat);
		
	}


	public void setSpinach(Spinach spinach) {
		this.spinach = spinach;
	}

	public void setMushroom(Mushroom mushroom) {
		this.mushroom = mushroom;
	}
	
	@Override
	public double calculatePrice() {
		
		double total = super.calculatePrice() ;
		
		if (this.spinach != null) {
			System.out.println("adding " + this.spinach.name + " for: " + this.spinach.price);
			total += this.spinach.price;
		}
		
		if (this.mushroom != null) {
			System.out.println("adding " + this.mushroom.name + " for: " + this.mushroom.price);
			total += this.mushroom.price;
		}
	
		
		return total;
	}
	
	
}

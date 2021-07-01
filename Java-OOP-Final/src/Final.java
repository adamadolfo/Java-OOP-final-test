
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bread rye = new Bread("rye");
			Bread white = new Bread("white");
			
			Meat beef = new Meat("beef");
			Meat turkey = new Meat("turkey");
			
			Drink fanta = new Drink("fanta");
			Chip cheeseCurls = new Chip("cheese curls");
			
			Cheese american = new Cheese("american");
			
		
			Spinach babySpinach = new Spinach("baby spinach"); 
			
			HealthyBurger healthy = new HealthyBurger(rye, turkey);
			
			healthy.setSpinach(babySpinach);
			healthy.setCheese(american);
			
			System.out.println(healthy.calculatePrice());
			
			
//			Hamburger haleysHamburger = new Hamburger("Haleys order", white, beef);
//			haleysHamburger.setCheese(american);
//			
//			System.out.println(haleysHamburger.calculatePrice());
		
			
			
	}

}

package ejc88_MenuManager;
/**
 * Class Menu
 * author : Everett Cannon
 * created: 10/7/2022
 */
public class Menu {
	//Properties
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	//Constructors
	public Menu(String name) {
		setName(name);
		entree = null;
		salad = null;
		side = null;
		dessert = null;
	}
	public Menu(String name, Entree entree, Side side) {
		setName(name);
		setEntree(entree);
		setSide(side);
		salad = null;
		dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		setName(name);
		setEntree(entree);
		setSide(side);
		setSalad(salad);
		setDessert(dessert);
	}
	//Methods

	//Sums the total calories 
	public int totalCalories() {
		int entreeCal;
		int saladCal;
		int sideCal;
		int dessertCal;
		int totalCal;

		if(entree==null) {
			entreeCal=0;
		}
		else {
			entreeCal= this.entree.getCalories();
		}
		if(salad==null) {
			saladCal=0;
		}
		else {
			saladCal= this.salad.getCalories();
		}
		if(side==null) {
			sideCal=0;
		}
		else {
			sideCal= this.side.getCalories();
		}
		if(dessert==null) {
			dessertCal=0;
		}
		else {
			dessertCal= this.dessert.getCalories();
		}
		totalCal = entreeCal + saladCal + sideCal + dessertCal;
		return totalCal;
	}

	//Displays the descriptions of all the menu items
	public String description() {
		String description = getName(); 

		if(entree==null) {
			description = description + "\nEntree: N/A\n";
		}
		else {
			description = description + ("\nEntree: "+this.entree.getName()+". "+this.entree.getDescription()+"\n");
		}
		if(salad==null) {
			description = description + ("Salad: N/A\n");
		}
		else {
			description = description + ("Salad: "+this.salad.getName()+". "+this.salad.getDescription()+"\n");
		}
		if(side==null) {
			description = description + ("Side: N/A\n");
		}
		else {
			description = description + ("Side: "+this.side.getName()+". "+this.side.getDescription()+"\n");
		}
		if(dessert==null) {
			description = description +("Dessert: N/A\n");
		}
		else {
			description = description + ("Dessert: "+this.dessert.getName()+". "+this.dessert.getDescription()+"\n");
		}
		return description;
	}
	//returns the menu as a string
	public String menuPrint() {
		String menu = getName(); 

		if(entree==null) {
			menu = menu + "\nEntree: N/A\n";
		}
		else {
			menu = menu + ("\nEntree: "+this.entree.getName()+". "+this.entree.getDescription()+". "+this.entree.getCalories()+" Calories "+this.entree.getPrice()+"$ "+"\n");
		}
		if(salad==null) {
			menu = menu + ("Salad: N/A\n");
		}
		else {
			menu = menu + ("Salad: "+this.salad.getName()+". "+this.salad.getDescription()+". "+this.salad.getCalories()+" Calories "+this.salad.getPrice()+"$ "+"\n");
		}
		if(side==null) {
			menu = menu + ("Side: N/A\n");
		}
		else {
			menu = menu + ("Side: "+this.side.getName()+". "+this.side.getDescription()+". "+this.side.getCalories()+" Calories "+this.side.getPrice()+"$ "+"\n");
		}
		if(dessert==null) {
			menu = menu +("Dessert: N/A\n");
		}
		else {
			menu = menu + ("Dessert: "+this.dessert.getName()+". "+this.dessert.getDescription()+". "+this.dessert.getCalories()+" Calories "+this.dessert.getPrice()+"$ "+"\n");
		}
		menu = menu + ("\nTotal Calories: "+ this.totalCalories()+"\nTotal Price: "+this.totalPrice()+"\n\n");
		return menu;

	}
	//sums the price of a menu and returns the total
	public double totalPrice() {
		double entreePr;
		double saladPr;
		double sidePr;
		double dessertPr;
		double totalPr;

		if(entree==null) {
			entreePr=0;
		}
		else {
			entreePr= this.entree.getPrice();
		}
		if(salad==null) {
			saladPr=0;
		}
		else {
			saladPr= this.salad.getPrice();
		}
		if(side==null) {
			sidePr=0;
		}
		else {
			sidePr= this.side.getPrice();
		}
		if(dessert==null) {
			dessertPr=0;
		}
		else {
			dessertPr= this.dessert.getPrice();
		}
		totalPr = entreePr + saladPr + sidePr + dessertPr;
		return totalPr;
	}
	@Override
    public String toString() {
        return name;
    }
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

}

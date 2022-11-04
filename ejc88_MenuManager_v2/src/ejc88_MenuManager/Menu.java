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

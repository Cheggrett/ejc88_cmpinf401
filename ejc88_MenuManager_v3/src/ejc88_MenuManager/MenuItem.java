package ejc88_MenuManager;
/**
 * Class MenuItem
 * author : Everett Cannon
 * created: 11/20/2022
 */
public class MenuItem {

	//Properties
	private String name;
	private String description;
	private int calories;
	private double price;
	//constructor
	public MenuItem(String name, String description, int calories, double price ) {
		setName(name);
		setDescription(description);
		setCalories(calories);
		setPrice(price);
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}




package ejc88_MenuManager;
/**
 * Class Side
 * author : Everett Cannon
 * created: 10/7/2022
 */
public class Side {
	//Properties
	private String name;
	private String description;
	private int calories;
	//constructor
	public Side(String name, String description, int calories ) {
		setName(name);
		setDescription(description);
		setCalories(calories);
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

}

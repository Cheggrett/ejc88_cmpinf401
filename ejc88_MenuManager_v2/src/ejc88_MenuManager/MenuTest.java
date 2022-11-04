package ejc88_MenuManager;

/**
 * Class MenuTest
 * author : Everett Cannon
 * created: 10/8/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuRandomize randomize = new MenuRandomize("entrees.txt",
				"sides.txt","salads.txt","desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories"+
				myMenu.totalCalories());

	}

}

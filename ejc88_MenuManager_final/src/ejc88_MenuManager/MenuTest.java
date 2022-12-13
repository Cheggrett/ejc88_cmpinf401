package ejc88_MenuManager;


/**
 * Class MenuTest
 * author : Everett Cannon
 * created: 10/8/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MenuManager menuManager = new MenuManager("dishes.txt");
	Menu myMenu = menuManager.minCaloriesMenu("Min Cal test");
	System.out.println(myMenu.totalCalories());
	
	
	FileManager.writeMenu("menutest.txt",menuManager.getMenus());
	
	}

}

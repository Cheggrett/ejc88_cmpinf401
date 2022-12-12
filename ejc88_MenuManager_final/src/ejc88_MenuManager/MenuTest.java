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
	Menu myMenu = menuManager.randomMenu("myMenu");

	Menu myMenu2 = menuManager.randomMenu("myMenu2");

	Menu myMenu3 = menuManager.randomMenu("myMenu3");

	Menu myMenu4 = menuManager.randomMenu("myMenu4");
	Menu myMenu5 = menuManager.randomMenu("myMenu5");
	
	
	FileManager.writeMenu("menutest.txt",menuManager.getMenus());
	
	}

}

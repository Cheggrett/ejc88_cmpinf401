package ejc88_MenuManager;

import java.util.ArrayList;

/**
 * Class MenuTest
 * author : Everett Cannon
 * created: 10/8/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Menu> Menus= new ArrayList<Menu>();
	MenuManager menuManager = new MenuManager("dishes.txt");
	Menu myMenu = menuManager.randomMenu("myMenu");
	Menus.add(myMenu);
	Menu myMenu2 = menuManager.randomMenu("myMenu2");
	Menus.add(myMenu2);
	Menu myMenu3 = menuManager.randomMenu("myMenu3");
	Menus.add(myMenu3);
	Menu myMenu4 = menuManager.randomMenu("myMenu4");
	Menus.add(myMenu4);
	Menu myMenu5 = menuManager.randomMenu("myMenu5");
	Menus.add(myMenu5);
	
	FileManager.writeMenu("menutest.txt",Menus);
	
	}

}

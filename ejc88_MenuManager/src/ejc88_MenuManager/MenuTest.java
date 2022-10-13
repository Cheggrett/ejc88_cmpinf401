package ejc88_MenuManager;
/**
 * Class MenuTest
 * author : Everett Cannon
 * created: 10/8/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entree maineLobster = new Entree("Maine Lobster","Wild-caught, fresh from the Atlantic. Prepared to order in the classic style or roasted with crab-and-seafood stuffing. Served with choice of side. Not available for raw purchase.",650);
		Side cheeseBiscuits = new Side("Cheese Biscuits","Our world famous Cheese Biscuits",400);
		Menu redLobsterSpecials = new Menu("Daily Specials", maineLobster, cheeseBiscuits);
		Entree filetMignon = new Entree("Filet Mignon","Simply grilled with a peppercorn seasoning. Served with choice of side.",700);
		Side broccoli = new Side("Broccoli","Steamed fresh Broccoli, Served plain or with butter",50);
		Salad houseSalad = new Salad("House Salad","Traditional House Salad servied with choice of dressing",100);
		Dessert chocolateWave = new Dessert("Chocolate Wave","Layers of warm, decadent chocolate cake and creamy fudge frosting. Served with vanilla ice cream and rich chocolate sauce.",700);
		Menu redLobsterMainMenu = new Menu("Menu",filetMignon,broccoli,houseSalad,chocolateWave);
		redLobsterSpecials.description();
		redLobsterSpecials.totalCalories();
		redLobsterMainMenu.description();
		redLobsterMainMenu.totalCalories();
	}

}

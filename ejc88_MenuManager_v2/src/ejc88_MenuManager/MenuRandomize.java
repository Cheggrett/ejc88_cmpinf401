package ejc88_MenuManager;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MenuRandomize {
	private String entreeFile;
	private String sideFile;
	private String saladFile;
	private String dessertFile;
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		this.entreeFile = entreeFile;
		this.sideFile = sideFile;
		this.saladFile = saladFile;
		this.dessertFile = dessertFile;
	}
	public Menu randomMenu() {
		ArrayList<String> Entrees= new ArrayList<String>();
		ArrayList<String> Sides= new ArrayList<String>();
		ArrayList<String> Salads= new ArrayList<String>();
		ArrayList<String> Desserts= new ArrayList<String>();

		Entrees = FileManager.readEntrees(entreeFile);
		Sides = FileManager.readSides(sideFile);
		Salads = FileManager.readSalads(saladFile);
		Desserts = FileManager.readSalads(dessertFile);
		int min = 0;
		int max = 5;
		//Generates random Entree
		int entreeNum = (ThreadLocalRandom.current().nextInt(min, max))*3;
		String entreeName = Entrees.get(entreeNum);
		String entreeDesc = Entrees.get((entreeNum)+1);
		int entreeCal = Integer.parseInt(Entrees.get((entreeNum)+2));
		Entree entree = new Entree(entreeName,entreeDesc,entreeCal);
		//Generates random side
		int sideNum = (ThreadLocalRandom.current().nextInt(min, max))*3;
		String sideName = Sides.get(sideNum);
		String sideDesc = Sides.get((sideNum)+1);
		int sideCal = Integer.parseInt(Sides.get((sideNum)+2));
		Side side = new Side(sideName,sideDesc,sideCal);
		//Generates random salad
		int saladNum = (ThreadLocalRandom.current().nextInt(min, max))*3;
		String saladName = Salads.get(saladNum);
		String saladDesc = Salads.get((saladNum)+1);
		int saladCal = Integer.parseInt(Salads.get((saladNum)+2));
		Salad salad = new Salad(saladName,saladDesc,saladCal);
		//Generates random dessert
		int dessertNum = (ThreadLocalRandom.current().nextInt(min, max))*3;
		String dessertName = Desserts.get(dessertNum);
		String dessertDesc = Desserts.get((dessertNum)+1);
		int dessertCal = Integer.parseInt(Desserts.get((dessertNum)+2));
		Dessert dessert = new Dessert(dessertName,dessertDesc,dessertCal);

		Menu menu = new Menu("Random Menu", entree, side, salad, dessert);
		
		return menu;
		
	}
}

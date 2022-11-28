package ejc88_MenuManager;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MenuManager {
	
	private ArrayList<Entree> Entrees= new ArrayList<Entree>();
	private ArrayList<Side> Sides= new ArrayList<Side>();
	private ArrayList<Salad> Salads= new ArrayList<Salad>();
	private ArrayList<Dessert> Desserts= new ArrayList<Dessert>();
	public MenuManager(String filename) {
		ArrayList<MenuItem> Items= new ArrayList<MenuItem>();

		Items = FileManager.readItems(filename);
		int length = Items.size();
		for(int i=0;i<length;i++) {
			if(Items.get(i) instanceof Entree) {
				Entrees.add((Entree) Items.get(i));
			}
			if(Items.get(i) instanceof Side) {
				Sides.add((Side) Items.get(i));
			}
			if(Items.get(i) instanceof Salad) {
				Salads.add((Salad) Items.get(i));
			}
			if(Items.get(i) instanceof Dessert) {
				Desserts.add((Dessert) Items.get(i));
			
			}
		}
	}
	public Menu randomMenu(String name) {
		//gets random Entree
		int entreeMin = 0;
		int entreeMax = Entrees.size();
		int entreeNum = (ThreadLocalRandom.current().nextInt(entreeMin, entreeMax));
		//gets random Side
		int sideMin = 0;
		int sideMax = Sides.size();
		int sideNum = (ThreadLocalRandom.current().nextInt(sideMin, sideMax));
		//gets random Salad
		int saladMin = 0;
		int saladMax = Salads.size();
		int saladNum = (ThreadLocalRandom.current().nextInt(saladMin, saladMax));
		//gets random Dessert
		int dessertMin = 0;
		int dessertMax = Desserts.size();
		int dessertNum = (ThreadLocalRandom.current().nextInt(dessertMin, dessertMax));
		Menu menu = new Menu(name,Entrees.get(entreeNum),Sides.get(sideNum),Salads.get(saladNum),Desserts.get(dessertNum));
		return menu;
	}
	//getters and setters
	public ArrayList<Entree> getEntrees() {
		return Entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		Entrees = entrees;
	}
	public ArrayList<Side> getSides() {
		return Sides;
	}
	public void setSides(ArrayList<Side> sides) {
		Sides = sides;
	}
	public ArrayList<Salad> getSalads() {
		return Salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		Salads = salads;
	}
	public ArrayList<Dessert> getDesserts() {
		return Desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		Desserts = desserts;
	}
	
	
}

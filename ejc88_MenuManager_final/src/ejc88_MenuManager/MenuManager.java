package ejc88_MenuManager;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Class MenuManager
 * author : Everett Cannon
 * created: 11/20/2022
 */

public class MenuManager {
	
	private ArrayList<Entree> Entrees= new ArrayList<Entree>();
	private ArrayList<Side> Sides= new ArrayList<Side>();
	private ArrayList<Salad> Salads= new ArrayList<Salad>();
	private ArrayList<Dessert> Desserts= new ArrayList<Dessert>();
	private static ArrayList<Menu> Menus= new ArrayList<Menu>();
	//constructor, reads item into an arraylist
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
	//generates a random menu using objects in the array list
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
	
	public Menu minCaloriesMenu(String name) {
		Entree entree = Entrees.get(0);
		Side side = Sides.get(0);
		Salad salad = Salads.get(0);
		Dessert dessert = Desserts.get(0);
		for(int i=0;i<this.getEntrees().size();i++) {
			if(Entrees.get(i).getCalories()<entree.getCalories()) {
				entree = Entrees.get(i);
			}
		}
		
		for(int i=0;i<this.getSides().size();i++) {
			if(Sides.get(i).getCalories()<side.getCalories()) {
				side = Sides.get(i);
			}
		}
		
		for(int i=0;i<this.getSalads().size();i++) {
			if(Salads.get(i).getCalories()<salad.getCalories()) {
				salad = Salads.get(i);
			}
		}
		
		for(int i=0;i<this.getDesserts().size();i++) {
			if(Salads.get(i).getCalories()<dessert.getCalories()) {
				dessert = Desserts.get(i);
			}
		}
		
		Menu menu = new Menu(name,entree,side,salad,dessert);
		return menu;
	}
	
	public Menu maxCaloriesMenu(String name) {
		Entree entree = Entrees.get(0);
		Side side = Sides.get(0);
		Salad salad = Salads.get(0);
		Dessert dessert = Desserts.get(0);
		for(int i=0;i<this.getEntrees().size();i++) {
			if(Entrees.get(i).getCalories()>entree.getCalories()) {
				entree = Entrees.get(i);
			}
		}
		
		for(int i=0;i<this.getSides().size();i++) {
			if(Sides.get(i).getCalories()>side.getCalories()) {
				side = Sides.get(i);
			}
		}
		
		for(int i=0;i<this.getSalads().size();i++) {
			if(Salads.get(i).getCalories()>salad.getCalories()) {
				salad = Salads.get(i);
			}
		}
		
		for(int i=0;i<this.getDesserts().size();i++) {
			if(Salads.get(i).getCalories()>dessert.getCalories()) {
				dessert = Desserts.get(i);
			}
		}
		
		Menu menu = new Menu(name,entree,side,salad,dessert);
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
	public ArrayList<Menu> getMenus() {
		return Menus;
	}
	public void setMenus(ArrayList<Menu> menus) {
		Menus = menus;
	}
	
	
}

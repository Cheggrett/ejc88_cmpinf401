package ejc88_MenuManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class FileManager
 * author : Everett Cannonn
 * created: 11/1/2022
 */
public class FileManager {

	private static String projectPath = System.getProperty("user.dir");
	/**
	 * Method readEntrees
	 * @param fileName name of .txt file containing entrees
	 * @return Array list of separated data
	 */

	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<String> ItemsSTR= new ArrayList<String>();
		ArrayList<MenuItem> Items= new ArrayList<MenuItem>();
		String itemDataPath = projectPath + "/data/" + fileName;
		try {
			FileReader fr = new FileReader(itemDataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				for(int i=0; i<data.length;i++) {
					ItemsSTR.add(data[i]);
				}

			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int loop = (ItemsSTR.size())/5;
		for(int i=0;i<loop;i++) {
			int j= i*5;
			String type =ItemsSTR.get(j+1);
			if(type.equals("entree")){
				Entree entree = new Entree(ItemsSTR.get(j),ItemsSTR.get(j+2),Integer.parseInt(ItemsSTR.get(j+3)),Double.parseDouble(ItemsSTR.get(j+4)));
				Items.add(entree);
			}
			else if(type.equals("side")){
				Side side = new Side(ItemsSTR.get(j),ItemsSTR.get(j+2),Integer.parseInt(ItemsSTR.get(j+3)),Double.parseDouble(ItemsSTR.get(j+4)));
				Items.add(side);
			}
			else if(type.equals("salad")){
				Salad salad = new Salad(ItemsSTR.get(j),ItemsSTR.get(j+2),Integer.parseInt(ItemsSTR.get(j+3)),Double.parseDouble(ItemsSTR.get(j+4)));
				Items.add(salad);
			}
			else if(type.equals("dessert")){
				Dessert dessert = new Dessert(ItemsSTR.get(j),ItemsSTR.get(j+2),Integer.parseInt(ItemsSTR.get(j+3)),Double.parseDouble(ItemsSTR.get(j+4)));
				Items.add(dessert);
			}
		}
		return Items;
	}
	
	public static void writeMenu( String fileName, ArrayList<Menu> menus ) {
		String itemDataPath = projectPath + "/data/" + fileName;
		try {
			FileWriter fw = new FileWriter(itemDataPath);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i =0;i<menus.size();i++) {
				bw.write((menus.get(i)).menuPrint());
			}
			bw.close();
			fw.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
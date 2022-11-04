package ejc88_MenuManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class FileManager
 * author : Everett Cannon
 * created: 11/1/2022
 */
public class FileManager {

	private static String projectPath = System.getProperty("user.dir");
	/**
	 * Method readEntrees
	 * @param fileName name of .txt file containing entrees
	 * @return Array list of separated data
	 */

	public static ArrayList<String> readEntrees(String fileName) {
		ArrayList<String> Entrees= new ArrayList<String>();
		String entreeDataPath = projectPath + "/data/" + fileName;
		try {
			FileReader fr = new FileReader(entreeDataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				for(int i=0; i<data.length;i++) {
					Entrees.add(data[i]);
				}

			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Entrees;
	}
	/**
	 * Method readSides
	 * @param fileName name of .txt file containing sides
	 * @return Array list of separated data
	 */
	public static ArrayList<String> readSides(String fileName) {
		ArrayList<String> Sides= new ArrayList<String>();
		String sidesDataPath = projectPath + "/data/" + fileName;
		try {
			FileReader fr = new FileReader(sidesDataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				for(int i=0; i<data.length;i++) {
					Sides.add(data[i]);
				}

			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Sides;
	}
	/**
	 * Method readSalads
	 * @param fileName name of .txt file containing salads
	 * @return Array list of separated data
	 */
	public static ArrayList<String> readSalads(String fileName) {
		ArrayList<String> Salads= new ArrayList<String>();
		String saladsDataPath = projectPath + "/data/" + fileName;
		try {
			FileReader fr = new FileReader(saladsDataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				for(int i=0; i<data.length;i++) {
					Salads.add(data[i]);
				}

			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Salads;
	}
	/**
	 * Method readDessert
	 * @param fileName name of .txt file containing desserts
	 * @return Array list of separated data
	 */
	public static ArrayList<String> readDessert(String fileName) {
		ArrayList<String> Desserts= new ArrayList<String>();
		String dessertsDataPath = projectPath + "/data/" + fileName;
		try {
			FileReader fr = new FileReader(dessertsDataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				for(int i=0; i<data.length;i++) {
					Desserts.add(data[i]);
				}

			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Desserts;
	}
}

package ejc88_MenuManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class MenuManagerGUI
 * author : Everett Cannon
 * created: 12/7/2022
 */

public class MenuManagerGUI {
	MenuManager manager;
	JFrame main;
	JPanel panelBuild;
	JLabel lblBuild;
	JLabel lblEntree;
	JLabel lblSide;
	JLabel lblSalad;
	JLabel lblDessert;
	JLabel lblGen;
	JComboBox<Entree> cmbEntree;
	JComboBox<Side> cmbSide;
	JComboBox<Salad> cmbSalad;
	JComboBox<Dessert> cmbDessert;
	JButton jbtCreate;
	JButton jbtRand;

	DefaultListModel<Menu> dlm;
	JList listMenus;

	//Constructor: Creates the Main Frame and populates it with swing elements
	public MenuManagerGUI() {
		MenuManager manager = new MenuManager("dishes.txt");
		JFrame main = new JFrame("MenuManager");
		main.setLayout(null);
		main.setBounds(10, 10, 750, 500);
		main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setMain(main);

		JLabel lblBuild = new JLabel("Build your own menu");
		lblBuild.setBounds(10, 10, 150, 20);
		main.getContentPane().add(lblBuild);

		JLabel lblEntree = new JLabel("Entree");
		lblEntree.setBounds(20, 40, 100, 20);
		main.getContentPane().add(lblEntree);

		Entree[] entreeList = new Entree[manager.getEntrees().size()];
		entreeList = manager.getEntrees().toArray(entreeList);
		JComboBox<Entree> cmbEntree = new JComboBox<Entree>(entreeList);
		cmbEntree.setBounds(130,40,150,20);
		main.getContentPane().add(cmbEntree);


		JLabel lblSide = new JLabel("Side");
		lblSide.setBounds(20, 70, 100, 20);
		main.getContentPane().add(lblSide);

		Side[] sideList = new Side[manager.getSides().size()];
		sideList = manager.getSides().toArray(sideList);
		JComboBox<Side> cmbSide = new JComboBox<Side>(sideList);
		cmbSide.setBounds(130,70,150,20);
		main.getContentPane().add(cmbSide);

		JLabel lblSalad = new JLabel("Salad");
		lblSalad.setBounds(20, 100, 100, 20);
		main.getContentPane().add(lblSalad);

		Salad[] saladList = new Salad[manager.getSalads().size()];
		saladList = manager.getSalads().toArray(saladList);
		JComboBox<Salad> cmbSalad = new JComboBox<Salad>(saladList);
		cmbSalad.setBounds(130,100,150,20);
		main.getContentPane().add(cmbSalad);

		JLabel lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(20, 130, 100, 20);
		main.getContentPane().add(lblDessert);

		Dessert[] dessertList = new Dessert[manager.getDesserts().size()];
		dessertList = manager.getDesserts().toArray(dessertList);
		JComboBox<Dessert> cmbDessert = new JComboBox<Dessert>(dessertList);
		cmbDessert.setBounds(130,130,150,20);
		main.getContentPane().add(cmbDessert);

		//creates a menu with the dishes selected in the combo boxes
		JButton jbtCreate = new JButton("Create Menu with these dishes");
		jbtCreate.setBounds(20,160,230,25);
		main.getContentPane().add(jbtCreate);
		jbtCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");

				Menu menu = new Menu(name, (Entree) cmbEntree.getSelectedItem(), (Side) cmbSide.getSelectedItem(), (Salad) cmbSalad.getSelectedItem(), (Dessert) cmbDessert.getSelectedItem());
				manager.getMenus().add(menu);
				dlm.add(0, menu);

			}
		});
		JLabel lblGen = new JLabel("Generate a Menu");
		lblGen.setBounds(15, 200, 170, 20);
		main.getContentPane().add(lblGen);

		//Generates a random menu
		JButton jbtRand = new JButton("Generate Random Menu");
		jbtRand.setBounds(20,240,230,25);
		main.getContentPane().add(jbtRand);
		jbtRand.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");
				Menu menu = manager.randomMenu(name);
				manager.getMenus().add(menu);
				dlm.add(0, menu);

			}
		});
		
		//generates a menu with minimum calories
		JButton jbtlow = new JButton("Generate Low Calorie Menu");
		jbtlow.setBounds(20,265,230,25);
		main.getContentPane().add(jbtlow);
		jbtlow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");
				Menu menu = manager.minCaloriesMenu(name);
				manager.getMenus().add(menu);
				dlm.add(0, menu);

			}
		});
		
		//generates menu with maximum calories
		JButton jbtHigh = new JButton("Generate Low Calorie Menu");
		jbtHigh.setBounds(20,290,230,25);
		main.getContentPane().add(jbtHigh);
		jbtHigh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");
				Menu menu = manager.maxCaloriesMenu(name);
				manager.getMenus().add(menu);
				dlm.add(0, menu);

			}
		});

		JLabel lblMenus = new JLabel("Created Menus");
		lblMenus.setBounds(500, 10, 150, 20);
		main.getContentPane().add(lblMenus);

		dlm = new DefaultListModel<Menu>();
		listMenus = new JList<Menu>(dlm);
		listMenus.setBounds(425,35,245,380);
		main.getContentPane().add(listMenus);

		//Opens up selected menu and displays details
		JButton jbtDetail = new JButton("Details");
		jbtDetail.setBounds(425,430,70,20);
		main.getContentPane().add(jbtDetail);
		jbtDetail.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu menu = (Menu) listMenus.getSelectedValue();
				JFrame details = new JFrame("Menu: " +(Menu) listMenus.getSelectedValue());
				details.setLayout(null);
				details.setBounds(760, 10, 500, 500);

				JLabel lblEntree = new JLabel("Entree: " + menu.getEntree().getName());
				lblEntree.setBounds(12, 5, 150, 20);
				details.getContentPane().add(lblEntree);

				JTextField txtEntree = new JTextField(menu.getEntree().getDescription());
				txtEntree.setBounds(10, 20, 480, 50);
				txtEntree.setEditable(false);
				details.getContentPane().add(txtEntree);

				JLabel lblSide = new JLabel("Side: " + menu.getSide().getName());
				lblSide.setBounds(12, 70, 150, 20);
				details.getContentPane().add(lblSide);

				JTextField txtSide = new JTextField(menu.getSide().getDescription());
				txtSide.setBounds(10, 85, 480, 50);
				txtSide.setEditable(false);
				details.getContentPane().add(txtSide);

				JLabel lblSalad = new JLabel("Salad: " + menu.getSalad().getName());
				lblSalad.setBounds(12, 135, 150, 20);
				details.getContentPane().add(lblSalad);

				JTextField txtSalad = new JTextField(menu.getSalad().getDescription());
				txtSalad.setBounds(10, 150, 480, 50);
				txtSalad.setEditable(false);
				details.getContentPane().add(txtSalad);

				JLabel lblDessert = new JLabel("Dessert: "  + menu.getDessert().getName());
				lblDessert.setBounds(12, 200, 150, 20);
				details.getContentPane().add(lblDessert);

				JTextField txtDessert = new JTextField(menu.getDessert().getDescription());
				txtDessert.setBounds(10, 215, 480, 50);
				txtDessert.setEditable(false);
				details.getContentPane().add(txtDessert);

				JLabel lblCal = new JLabel("Total Calories");
				lblCal.setBounds(12, 270, 100, 20);
				details.getContentPane().add(lblCal);

				JTextField txtCal = new JTextField(String.valueOf(menu.totalCalories()));
				txtCal.setBounds(100, 270, 100, 20);
				txtCal.setEditable(false);
				details.getContentPane().add(txtCal);

				JLabel lblPrice = new JLabel("Total Price");
				lblPrice.setBounds(12, 300, 100, 20);
				details.getContentPane().add(lblPrice);

				JTextField txtPrice = new JTextField(String.valueOf(menu.totalPrice()));
				txtPrice.setBounds(100, 300, 100, 20);
				txtPrice.setEditable(false);
				details.getContentPane().add(txtPrice);

				details.setVisible(true);

			}
		});
		
		//deletes created menus
		JButton jbtDel = new JButton("Delete all");
		jbtDel.setBounds(507,430,70,20);
		main.getContentPane().add(jbtDel);
		jbtDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dlm.clear();
				manager.getMenus().clear();
			}
		});
		//saves created menus to file
		JButton jbtSave = new JButton("Save to File");
		jbtSave.setBounds(590,430,80,20);
		main.getContentPane().add(jbtSave);
		jbtSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu("menutest.txt",manager.getMenus());
			}
		});

	}

	public static void main(String[] args) {
		MenuManagerGUI Manager = new MenuManagerGUI();
		Manager.getMain().setVisible(true);


		/**	JLabel lblSalad = new JLabel("Salad");
		lblSalad.setBounds(12, 130, 100, 20);
		details.getContentPane().add(lblSalad); */






	}

	public JFrame getMain() {
		return main;
	}

	public void setMain(JFrame main) {
		this.main = main;
	}

	public MenuManager getManager() {
		return manager;
	}

	public void setManager(MenuManager manager) {
		this.manager = manager;
	}

	public JLabel getLblBuild() {
		return lblBuild;
	}

	public void setLblBuild(JLabel lblBuild) {
		this.lblBuild = lblBuild;
	}

	public JPanel getPanelBuild() {
		return panelBuild;
	}

	public void setPanelBuild(JPanel panelBuild) {
		this.panelBuild = panelBuild;
	}

}

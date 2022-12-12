package ejc88_MenuManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
	JComboBox cmbEntree;
	JComboBox cmbSide;
	JComboBox cmbSalad;
	JComboBox cmbDessert;
	JButton jbtCreate;
	JButton jbtRand;


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

		JComboBox<Entree> cmbEntree = new JComboBox(manager.getEntrees().toArray());
		cmbEntree.setBounds(130,40,150,20);
		main.getContentPane().add(cmbEntree);


		JLabel lblSide = new JLabel("Side");
		lblSide.setBounds(20, 70, 100, 20);
		main.getContentPane().add(lblSide);

		JComboBox<Side> cmbSide = new JComboBox(manager.getSides().toArray());
		cmbSide.setBounds(130,70,150,20);
		main.getContentPane().add(cmbSide);

		JLabel lblSalad = new JLabel("Salad");
		lblSalad.setBounds(20, 100, 100, 20);
		main.getContentPane().add(lblSalad);

		JComboBox<Salad> cmbSalad = new JComboBox(manager.getSalads().toArray());
		cmbSalad.setBounds(130,100,150,20);
		main.getContentPane().add(cmbSalad);

		JLabel lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(20, 130, 100, 20);
		main.getContentPane().add(lblDessert);

		JComboBox<Dessert> cmbDessert = new JComboBox(manager.getDesserts().toArray());
		cmbDessert.setBounds(130,130,150,20);
		main.getContentPane().add(cmbDessert);

		JButton jbtCreate = new JButton("Create Menu with these dishes");
		jbtCreate.setBounds(20,160,230,25);
		main.getContentPane().add(jbtCreate);
		jbtCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");
				//Menu menu = new Menu(cmbEntree.getSelectedItem(),cmbSide.getSelectedItem());

			}
		});
		JLabel lblGen = new JLabel("Generate a Menu");
		lblGen.setBounds(15, 200, 170, 20);
		main.getContentPane().add(lblGen);

		JButton jbtRand = new JButton("Generate Random Menu");
		jbtRand.setBounds(20,240,230,25);
		main.getContentPane().add(jbtRand);
		jbtRand.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter a Name");
				Menu menu = manager.randomMenu(name);
				manager.getMenus().add(menu);

			}
		});

		JLabel lblMenus = new JLabel("Created Menus");
		lblMenus.setBounds(500, 10, 150, 20);
		main.getContentPane().add(lblMenus);

		DefaultListModel<Menu> dlm = new DefaultListModel<Menu>();
		JList listMenus = new JList(dlm);
		listMenus.setBounds(425,35,245,380);
		main.getContentPane().add(listMenus);


		JButton jbtDetail = new JButton("Details");
		jbtDetail.setBounds(425,430,70,20);
		main.getContentPane().add(jbtDetail);
		jbtDetail.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton jbtDel = new JButton("Delete all");
		jbtDel.setBounds(507,430,70,20);
		main.getContentPane().add(jbtDel);
		jbtDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JButton jbtSave = new JButton("Save to File");
		jbtSave.setBounds(590,430,80,20);
		main.getContentPane().add(jbtSave);
		jbtSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	public static void main(String[] args) {
		MenuManagerGUI Manager = new MenuManagerGUI();
		Manager.getMain().setVisible(true);

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

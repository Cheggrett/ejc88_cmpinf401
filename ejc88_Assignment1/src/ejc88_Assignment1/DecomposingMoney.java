package ejc88_Assignment1;

import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		String moneystr = JOptionPane.showInputDialog("What amount of money would youn like to count");
		int money=Integer.parseInt(moneystr);
		double grands = money/1000;
		money = money%1000;
		double bens = money/100;
		money = money%100;
		double saws = money/10;
		money = money%10;
		double buck = money/1;
		String G =""+grands;
		String B =""+bens;
		String S = ""+saws;
		String Bs = ""+buck;	
		
		JOptionPane.showMessageDialog(null, "There are " +G + " grands, " +B +" bens " +S + " sawsbucks, and " +Bs +" bucks");
		

	}

}

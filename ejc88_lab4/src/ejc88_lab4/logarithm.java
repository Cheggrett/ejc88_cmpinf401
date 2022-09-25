package ejc88_lab4;

import javax.swing.JOptionPane;

public class logarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 0;
		int num = 0;

		do {
			String baseSTR = JOptionPane.showInputDialog(null, "Enter a base 'b'");
			base = Integer.parseInt(baseSTR);
		} while (base <= 1);

		do {
			String numSTR = JOptionPane.showInputDialog(null, "Enter a number 'X'");
			num = Integer.parseInt(numSTR);
		} while (num <= 0);
		int i = 0;
		while (num > base)
		{
			num = num / base;
			i++;

		}
		JOptionPane.showMessageDialog(null, "the answer is "+i);
	}

}

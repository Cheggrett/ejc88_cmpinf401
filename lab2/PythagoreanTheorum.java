package ejc88_Assignment1;

import javax.swing.JOptionPane;

public class PythagoreanTheorum {

	public static void main(String[] args) {
		String ASTR = JOptionPane.showInputDialog("Enter the first length");
		String BSTR = JOptionPane.showInputDialog("Enter the second length");
		int A = Integer.parseInt(ASTR);
		int B = Integer.parseInt(BSTR);
		double C = (Math.pow(A,2)+Math.pow(B, 2));
		C= Math.sqrt(C);
		String Hypotenuse=""+C;
		JOptionPane.showMessageDialog(null, "the Hypotenuse is" + Hypotenuse);
		
	}

}

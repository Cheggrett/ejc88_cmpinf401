package ejc88_Assignment1;

import javax.swing.JOptionPane;

public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
		String rSTR =JOptionPane.showInputDialog("Enter the radius of the circle");
		int r = Integer.parseInt(rSTR);
		double p = (2*Math.PI*r);
		double a =(Math.PI*r*r);
		String perimeter =""+p;
		String area = ""+a;
		JOptionPane.showMessageDialog(null, "the area is " + area +" and the perimeter is " + perimeter);
		
	}

}

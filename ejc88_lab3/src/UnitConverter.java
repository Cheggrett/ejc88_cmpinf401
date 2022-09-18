import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		//gets input from user
		String input=JOptionPane.showInputDialog("Enter the unit you would like to convert: ");
		//splits the input into the number and the unit
		int space = input.indexOf(" ");
		int length = input.length();
		double number = Double.parseDouble(input.substring(0,space));
		String unit = input.substring(space,length);
		//converts unit into lower case
		unit = unit.toLowerCase();
		//determines the unit and runs the associated conversion
		
		double conversion ;
		
		if(unit.equals(" in")) {
			conversion = number*2.54;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " cm");
			
		}
		else if(unit.equals(" cm")) {
			conversion = number/2.54;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " in");
		}
		else if(unit.equals(" yd")) {
			conversion = number/1.094;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " m");
		}
		else if(unit.equals(" m")) {
			conversion = number*1.094;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " yd");
		}
		else if(unit.equals(" oz")) {
			conversion = number*28.35;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " gm");
		}
		else if(unit.equals(" gm")) {
			conversion = number/28.35;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " oz");
		}
		else if(unit.equals(" kg")) {
			conversion = number*2.205;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " lb");
		}
		else if(unit.equals(" lb")) {
			conversion = number/2.205;
			JOptionPane.showMessageDialog(null,input + " = " + conversion + " ks");
		}
		else {
			JOptionPane.showMessageDialog(null,"Entered incorrect unit");
		
		}
		
		}
	}



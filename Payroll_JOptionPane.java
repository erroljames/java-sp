import javax.swing.JOptionPane;

public class PayRollDialog{
	public static void main(String[] args){
	 String inputString, name;
	 int hrs;
	 double grossPay, payRate;
	 
	//input name 
	name =JOptionPane.showInputDialog("What is your name?");
	
	//input hours
	inputString = JOptionPane.showInputDialog("How many hours did you work?");
	//convert IS ---> Int
	hrs = Integer.parseInt(inputString);
	
	//input payRate
	inputString = JOptionPane.showInputDialog("What is your work hourly rate?");
	//convert IS ----> Dob
	payRate = Double.parseDouble(inputString);
	
	//process
	grossPay=hrs*payRate;
	
	//print results;
	JOptionPane.showMessageDialog(null, ""+name+".Your grosspay is Php."+grossPay);
	//exit now
	System.exit(0);
	}
}
package as2;

import javax.swing.JOptionPane;

public class Average 
{
	
  public static void main (String [] args) 
  {
	  String in, out;
	  //input two numbers
	  in=JOptionPane.showInputDialog
					          ("Enter a number");
	  double n1 = Double.parseDouble(in);
	
	  in=JOptionPane.showInputDialog
				               ("Enter a number");
      double n2 = Double.parseDouble(in);
      
      in=JOptionPane.showInputDialog
	                          ("Enter a number");
      double n3 = Double.parseDouble(in);
      
	  double sum = n1 + n2 + n3;
	  double avg = sum / 3;
	  //build output
	  out = "The sum of " + n1 + " and " + n2 + " and " + n3 +
		  " is " + sum + "\n";
	  out = out + "The average of " + n1 + " and " + n2 + " and " + n3 +
			  " is " + avg + "\n";
	  
	  
	  //display output
	  JOptionPane.showMessageDialog(null, out);
	}
}
package AS3;

import javax.swing.JOptionPane;

public class RectangleProc {

	public static void main(String[] args) {
		String in, out;
		  //include length and width
		  in = JOptionPane.showInputDialog("Enter length");
		  double length = Double.parseDouble(in);
		  in = JOptionPane.showInputDialog("Enter width");
		  double width = Double.parseDouble(in);
		  double area=computeArea(length, width);
		  double perim=computePerim(length, width);
		  //build output
		  out = "Length: " + length + "\n";
		  out = out + "Width: " + width + "\n";
		  out = out + "Area: " + area + "\n";
		  out = out + "Perimeter: " + perim + "\n";
		  
		  //display output
	      JOptionPane.showMessageDialog(null, out);
	}
    static double computeArea (double len, double wid)
    {
    	double a;
    	a = len * wid;
    	return a;
    }
    static double computePerim (double len, double wid)
    {
    	double p;
    	p = (len + wid) * 2;
    	return p;
    }
}
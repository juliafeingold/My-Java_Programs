package asRectangleProc;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle (double l, double w) {
		length=l;
		width=w;
	}
	public double findArea () {
		double a;
		a=length*width;
		return a;
	}
	public double findPerim () {
		double p;
		p=2*(length+width);
		return p;
	}
	public double findDiag () {
		double d;
		return 0;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
}


package asRectangleProc;


import javax.swing.JOptionPane;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec1;
		String in,out;
		in=JOptionPane.showInputDialog("Enter length ");
		double len=Double.parseDouble(in);
		in=JOptionPane.showInputDialog("Enter width ");
		double wid=Double.parseDouble(in);
		rec1=new Rectangle(len,wid);

		in=JOptionPane.showInputDialog("Enter length ");
		len=Double.parseDouble(in);
		in=JOptionPane.showInputDialog("Enter width ");
		wid=Double.parseDouble(in);
		Rectangle rec2=new Rectangle(len,wid);
		
		//using first object
		double area=rec1.findArea();
		double perim=rec1.findPerim();
		len=rec1.getLength();
		wid=rec1.getWidth();
		//built output for first object
		out="First Rectangle\n";
		out += "Length: " + len + "\n";
		out += "Width: " + wid + "\n";
		out += "Area: " + area + "\n";
		out += "Perimeter: " + perim + "\n";
		
		//using second object
		area=rec2.findArea();
		perim=rec2.findPerim();
		len=rec2.getLength();
		wid=rec2.getWidth();
		//built output second object
		out +="\nSecond Rectangle\n";
		out += "Length: " + len + "\n";
		out += "Width: " + wid + "\n";
		out += "Area: " + area + "\n";
		out += "Perimeter: " + perim + "\n";
		
		//display output
		JOptionPane.showMessageDialog(null, out);
	}
}
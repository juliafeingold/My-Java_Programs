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

package as19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class JFrameExt extends JFrame {
	private double north;
	private double south;
	private double east;
	private double west;
	private double midWest;
	
public JFrameExt
		(double north, double south, double east, double west, double midWest) throws HeadlessException {
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.midWest = midWest;
	}
	
@Override
	public void paint(Graphics g) {
		double all = north + south + east + west + midWest;
		super.paint(g);
		int startAngle = 0;
		int arcAngle = (int)(north / all * 360);
		g.setColor(Color.red);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		startAngle = startAngle + arcAngle;
		arcAngle = (int)(south / all * 360);
		g.setColor(Color.green);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		startAngle = startAngle + arcAngle;
		arcAngle = (int)(east / all * 360);
		g.setColor(Color.blue);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		startAngle = startAngle + arcAngle;
		arcAngle = (int)(west / all * 360);
		g.setColor(Color.MAGENTA);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		startAngle = startAngle + arcAngle;
		arcAngle = (int)(midWest / all * 360);
		g.setColor(Color.pink);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		//legend for all regions
		
		int xRect = 100;
		int rectWidth = 50;
		int horSpacing = 10;
		int vertSpacing = 5;
		
		//north
		int yRect = 500;
		int rectHeight = 10;
		g.setColor(Color.red);
		g.fillRect(xRect, yRect, rectWidth, rectHeight);
		
		int xString = xRect + rectWidth + horSpacing;
		int yString = yRect + rectHeight;
		String theString = "North - 20";
		g.drawString(theString, xString, yString);
		
		//south
		yRect = yRect + rectHeight + vertSpacing;
		rectHeight = 10;
		g.setColor(Color.green);
		g.fillRect(xRect, yRect, rectWidth, rectHeight);
		
		xString = xRect + rectWidth + horSpacing;
		yString = yRect + rectHeight;
		theString = "south - 25";
		g.drawString(theString, xString, yString);
		
		//east
		yRect = yRect + rectHeight + vertSpacing;
		rectHeight = 10;
		g.setColor(Color.blue);
		g.fillRect(xRect, yRect, rectWidth, rectHeight);
		
		xString = xRect + rectWidth + horSpacing;
		yString = yRect + rectHeight;
		theString = "east - 15";
		g.drawString(theString, xString, yString);
		
		//west
		yRect = yRect + rectHeight + vertSpacing;
		rectHeight = 10;
		g.setColor(Color.magenta);
		g.fillRect(xRect, yRect, rectWidth, rectHeight);
		
		xString = xRect + rectWidth + horSpacing;
		yString = yRect + rectHeight;
		theString = "west - 30";
		g.drawString(theString, xString, yString);
		
		//midwest
		yRect = yRect + rectHeight + vertSpacing;
		rectHeight = 10;
		g.setColor(Color.PINK);
		g.fillRect(xRect, yRect, rectWidth, rectHeight);
		
		xString = xRect + rectWidth + horSpacing;
		yString = yRect + rectHeight;
		theString = "midWest - 10";
		g.drawString(theString, xString, yString);	
	}
}

package as19;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String in;
		double north,south, east, west, midWest;
		in = JOptionPane.showInputDialog("Enter north sales");
		north = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter south sales");
		south = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter east sales");
		east = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter west sales");
		west = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter midWest sales");
		midWest = Double.parseDouble(in);

		
		JFrameExt f = new JFrameExt(north, south, east, west, midWest);
		f.setSize(700, 700);
		f.setVisible(true);	
	}
}

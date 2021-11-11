package as14;

public interface Status {
	public void displayStatus();
	public String getStatus();
}


package as14;

import javax.swing.JOptionPane;

public class Rectangle implements Status {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
	
	@Override
	public String getStatus() {
		String status = "Rectangle\n";
		status += "length = " + length + " width = " + width + "\n";
		return status;
	}	
}

package as14;

import javax.swing.JOptionPane;

public class Sibling implements Status {
	private String name;
	private int age;
	private int weight;
	public Sibling(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);	
	}
	
	@Override
	public String getStatus() {
		String status = "Sibling\n";
		status += "name =" + name + 
				" age = " + age + 
				" weight = " + weight +"\n";
		return status;
	}	
}

package as14;

import javax.swing.JOptionPane;

public class Student implements Status {
	private int id;
	private String name;
	private double [] scores;
	public Student(int id, String name, double[] scores) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
	}
	
	@Override
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
	
	@Override
	public String getStatus() {
		String status = "Student\n";
		status += "id =" + id + 
				"name =" + name + 
				" score = ";
		for (int i = 0; i < scores.length; i++) {
			status += scores[i] + " ";
		}
		status += "\n";
		return status;
	}	
}

package as14;

import javax.swing.JOptionPane;

public class TestStatus {

	public static void main(String[] args) {
		String in, out;
		Status[] stat = new Status[6];
		int stati = 0;
		
		//create 3 Rectangle objects
		for (int i = 0; i < 3; i++) {
			in = JOptionPane.showInputDialog
					("Enter length");
			double length = Double.parseDouble(in);	
			in = JOptionPane.showInputDialog
					("Enter width");
			double width = Double.parseDouble(in);
			stat[stati] =  new Rectangle(length, width);
			stati++;
		}
		
		//create 2 Siblings
		for (int i = 0; i < 2; i++) {
			String name = JOptionPane.showInputDialog
					("Enter name");
			in = JOptionPane.showInputDialog
					("Enter age");
			int age = Integer.parseInt(in);	
			in = JOptionPane.showInputDialog
					("Enter weight");
			int weight = Integer.parseInt(in);	
			stat[stati] =  new Sibling(name, age, weight);
			stati++;
		}
		
		//create 1 Student
		for (int i = 0; i < 1; i++) {
			in = JOptionPane.showInputDialog
					("Enter id");
			int id = Integer.parseInt(in);	
			String name = JOptionPane.showInputDialog
					("Enter name");
			in = JOptionPane.showInputDialog
					("Enter examcount");
			int examCount = Integer.parseInt(in);
			double[]scores = new double[examCount];
			
			//get exam scores
			for(int j = 0; j < examCount; j++) {
				in = JOptionPane.showInputDialog
						("Enter exam Score");
				scores[j] = Double.parseDouble(in);
			}
			stat[stati] =  new Student(id, name, scores);
			stati++;
		}
		
		//display status in a polymorphic loop
		for (int i = 0; i < stat.length; i++) {
			stat[i].displayStatus();
		}
		
		//get status in a polymorphic loop
		out = "";
		for (int i = 0; i < stat.length; i++) {
			out = out + stat[i].getStatus();
		}
		JOptionPane.showMessageDialog(null, out);	
	}
}

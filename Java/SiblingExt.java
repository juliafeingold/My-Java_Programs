package ac7;

public class Sibling {
	private String name;
	private int age;
	private int weight;
	
	//constructor
	public Sibling(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}
	
	
	
}

package ac7;

public class SiblingExt extends Sibling{
	private int height;

	public SiblingExt(String name, int age, 
			int weight, int height) {
		super(name, age, weight);
		this.height = height;
	}
	public int getHeight() {
		return height;
	}	
}

package ac7;

import javax.swing.JOptionPane;

public class TestSiblingExt {

	public static void main(String[] args) {
		String in, out, name;
		int age, weight, height;
		name =  JOptionPane.showInputDialog("Enter name");
		in =  JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);
		SiblingExt sibe1 = new SiblingExt
				(name, age, weight, height);
		name =  JOptionPane.showInputDialog("Enter name");
		in =  JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);
		SiblingExt sibe2 = new SiblingExt
				(name, age, weight, height);
		name =  JOptionPane.showInputDialog("Enter name");
		in =  JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in =  JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);
		SiblingExt sibe3 = new SiblingExt
				(name, age, weight, height);
		
		//find the lightest
		SiblingExt lightest = null;
		if (sibe1.getWeight() <= sibe2.getWeight() && 
				sibe1.getWeight() <= sibe3.getWeight()) {
			lightest = sibe1;
		}
		else if(sibe2.getWeight() <= sibe1.getWeight() && 
				sibe2.getWeight() <= sibe3.getWeight()) {
			lightest = sibe2;
		}	
		else {
			lightest = sibe3;
		}
		
		//find tallest
		SiblingExt tallest = null;
		if (sibe1.getHeight() >= sibe2.getHeight() && 
				sibe1.getHeight() >= sibe3.getHeight()) {
			tallest = sibe1;
		}
		else if(sibe2.getHeight() >= sibe1.getHeight() && 
				sibe2.getHeight() >= sibe3.getHeight()) {
			tallest = sibe2;
		}	
		else {
			tallest = sibe3;
		}
		
		//find oldest
		SiblingExt oldest = null;
		if (sibe1.getAge() >= sibe2.getAge() && 
				sibe1.getAge() >= sibe3.getAge()) {
			oldest = sibe1;
		}
		else if(sibe2.getAge() >= sibe1.getAge() && 
				sibe2.getAge() >= sibe3.getAge()) {
			oldest = sibe2;
		}	
		else {
			oldest = sibe3;
		}
		
		//find youngest
		SiblingExt youngest = null;
		if (sibe1.getAge() <= sibe2.getAge() && 
				sibe1.getAge() <= sibe3.getAge()) {
			youngest = sibe1;
		}
		else if(sibe2.getAge() <= sibe1.getAge() && 
				sibe2.getAge() <= sibe3.getAge()) {
			youngest = sibe2;
		}	
		else {
			youngest = sibe3;
		}
		
		//built output
		out = "The lightest sibling is " + lightest.getName()
			+ " " + lightest.getAge() + " " 
			+ lightest.getWeight() + " " 
			+ lightest.getHeight() + "\n";
		out += "The tallest sibling is " + tallest.getName()
			+ " " + tallest.getAge() + " " 
			+ tallest.getWeight() + " " 
			+ tallest.getHeight() + "\n";
		out += "The oldest sibling is " + oldest.getName()
			+ " " + oldest.getAge() + " " 
			+ oldest.getWeight() + " " 
			+ oldest.getHeight() + "\n";
		out += "The youngest sibling is " + youngest.getName()
			+ " " + youngest.getAge() + " " 
			+ youngest.getWeight() + " " 
			+ youngest.getHeight() + "\n";
		
		//display output
		JOptionPane.showMessageDialog(null, out);
	}
}
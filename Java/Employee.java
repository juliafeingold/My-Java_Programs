package as15;

public abstract class Employee {
	protected String name;
	protected double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public abstract double computeBonus();
}


package as15;

public class Worker extends Employee {
	private double pctBonus;

	public Worker(String name, double salary, double pctBonus) {
		super(name, salary);
		this.pctBonus = pctBonus;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	@Override
	public double computeBonus() {
		double bonus = salary * pctBonus;
		return bonus;
	}	
}

package as15;

public class Manager extends Employee {
		private double pctBonus;
		private double travelExpenses;
		public Manager(String name, double salary, double pctBonus, double travelExpenses) {
			super(name, salary);
			this.pctBonus = pctBonus;
			this.travelExpenses = travelExpenses;
		}
		public double getPctBonus() {
			return pctBonus;
		}
		public double getTravelExpenses() {
			return travelExpenses;
		}
		
		@Override
		public double computeBonus() {
			double bonus = (salary * pctBonus) + 500;
			return bonus;
		}		
}

package as15;

public class Executive extends Employee {
	private double pctBonus;
	private double travelExpenses;
	private int optionsCount;
	public Executive(String name, double salary, 
			double pctBonus, double travelExpenses, 
			int optionsCount) {
		super(name, salary);
		this.pctBonus = pctBonus;
		this.travelExpenses = travelExpenses;
		this.optionsCount = optionsCount;
	}
	public double getPctBonus() {
		return pctBonus;
	}
	public double getTravelExpenses() {
		return travelExpenses;
	}
	public int getOptionsCount() {
		return optionsCount;
	}
	
	@Override
	public double computeBonus() {
		double bonus = (salary * pctBonus) + 1000;
		return bonus;
	}	
}

package as15;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		String in, out = "", name, token;
		double salary, pctBonus, travelExpenses, bonus;
		Employee[] emp = new Employee[6];
		int empIndex = 0, optionsCount;
		
		//create 3 workers
		for(int i = 0; i < 3; i++) {
			in = JOptionPane.showInputDialog("Enter data");
			StringTokenizer stk = new StringTokenizer(in, ",");
			name = stk.nextToken().trim();
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			emp[empIndex] = new Worker
					(name, salary, pctBonus);
			empIndex++;
		}
		
		//create 2 managers
		for(int i = 0; i < 2; i++) {
			in = JOptionPane.showInputDialog("Enter data");
			StringTokenizer stk = new StringTokenizer(in, ",");
			name = stk.nextToken().trim();
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			token = stk.nextToken().trim();
			travelExpenses = Double.parseDouble(token);
			emp[empIndex] = new Manager (name, salary, pctBonus, travelExpenses);
			empIndex++;
		}
		
		//create 1 executive
		for(int i = 0; i < 1; i++) {
			in = JOptionPane.showInputDialog("Enter data");
			StringTokenizer stk = new StringTokenizer(in, ",");
			name = stk.nextToken().trim();
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			token = stk.nextToken().trim();
			travelExpenses = Double.parseDouble(token);
			token = stk.nextToken().trim();
			optionsCount = Integer.parseInt(token);
			emp[empIndex] = new Executive 
					(name, salary, pctBonus,
					travelExpenses, optionsCount);
			empIndex++;
		}

		//create polymorphic loop, compute bonus & built output
		for(int i = 0; i < 6; i++) {
			bonus = emp[i].computeBonus();
			out += "Name: " + emp[i].getName() + "\n";
			out += "Salary: " + emp[i].getSalary() + "\n";
			
			if(emp[i] instanceof Worker) {
				out += "Percent Bonus: " + 
						((Worker)emp[i]).getPctBonus() + "\n";
				out += "Total Bonus: " + bonus+ "\n";
			}
			
			if(emp[i] instanceof Manager) {
				out += "Percent Bonus: " + 
						((Worker)emp[i]).getPctBonus() + "\n";
				out += "Total Bonus: " + bonus+ "\n";
				out += "Travel Expenses: " + 
						((Manager)emp[i]).getTravelExpenses() + "\n";
			
			}
			
			if(emp[i] instanceof Executive) {
				out += "Percent Bonus: " + 
						((Worker)emp[i]).getPctBonus() + "\n";
				out += "Total Bonus: " + bonus+ "\n";
				out += "Option count: " + 
						((Executive)emp[i]).getOptionsCount() + "\n";
				out += "Travel Expenses: " + 
						((Manager)emp[i]).getTravelExpenses() + "\n";
			}
			//display
			JOptionPane.showMessageDialog(null, out);
		}
	}
}

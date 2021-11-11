package as11;

public class Student {
	private int id;
	private String name;
	private int[] scores;
	
	public Student(int id, String name, int[] scores) {
		super();
		this.id= id;
		this.name = name;
		this.scores = scores.clone();
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public  String findGrades() {
		double sum = 0, avg;
		String grade =  null;
		
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		avg = sum / scores.length;
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else if (avg >= 50) {
			grade = "F";
		}
		
		return grade;
	}
}

package as11;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStudent {

	public static void main(String[] args) {
		String in, out, name;
		int id;
		in = JOptionPane.showInputDialog
				("Ente student count:");
		int stCount = Integer.parseInt(in);
		
		//create an array of student references
		Student[] stAr = new Student [stCount];
	
		//populate student array of references
		for (int i = 0; i < stCount; i++) {
			
			//input one student data
			in = JOptionPane.showInputDialog
					("Ente one student data: ");
			StringTokenizer stk = 
					new StringTokenizer(in, ", ");
			String token= stk.nextToken().trim();
			id = Integer.parseInt(in);
			name = stk.nextToken().trim();
			token = stk.nextToken().trim();
			
			//create exam array count		
			int examCount =  Integer.parseInt(token);
			int[] examScores = new int[examCount];
			
			//populate exam array 
			for(int j = 0; j < examCount; j++) {
				token = stk.nextToken().trim();
				examScores[j] = Integer.parseInt(token);
			}
			
			//create one student object
			stAr[i] = new Student(id, name, examScores);
		}
		
		//get grades from student objects
		String outA = "", outB="", outC="", outD="", outF="", outAll;
		
		for (int i = 0; i < stAr.length; i++) {
			String grade = stAr[i].findGrades();
			
			if (grade.equalsIgnoreCase("A")) {
				outA += stAr[i].getId() + " ";
				outA += stAr[i].getName() + " ";
				outA += "(" + grade + ")\n";
			}
			else if (grade.equalsIgnoreCase("B")) {
				outB += stAr[i].getId() + " ";
				outB += stAr[i].getName() + " ";
				outB += "(" + grade + ")\n";
			}
			else if (grade.equalsIgnoreCase("C")) {
				outC += stAr[i].getId() + " ";
				outC += stAr[i].getName() + " ";
				outC += "(" + grade + ")\n";
			}
			else if (grade.equalsIgnoreCase("D")) {
				outD += stAr[i].getId() + " ";
				outD += stAr[i].getName() + " ";
				outD += "(" + grade + ")\n";
			}
			else if (grade.equalsIgnoreCase("F")) {
				outF += stAr[i].getId() + " ";
				outF += stAr[i].getName() + " ";
				outF += "(" + grade + ")\n";
			}
		}
		
		outAll = outA + outB + outC + outD + outF;
		JOptionPane.showMessageDialog(null, outAll);	
	}
}
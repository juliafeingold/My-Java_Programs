package as8;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		String in, out;
		in = JOptionPane.showInputDialog
				("Enter data separated by comma");
		String delim = ",";
		StringTokenizer stk = new StringTokenizer(in, delim);
		int itemCount = stk.countTokens();
		double[] x = new double [itemCount];
		
		for(int i = 0; i < x.length; i++) {
			String token = stk.nextToken().trim();
			x[i] = Double.parseDouble(token);
		}
			
		Statistics stat = new Statistics (x);
		double[] origData = stat.getOrigData();
		double[] sortedData = stat.getSortedData();
		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		
		double min2 = Statistics.computeMin(x);
		double max2 = Statistics.computeMax(x);
		double mean2 = Statistics.computeMean(x);
		double[]sortedData2 = Statistics.computeSortedData(x);
		
		double objectCount = Statistics.count;
		
		//build output 
		String pattern = ".000"; //output with 3 decimal spaces .000
		DecimalFormat df = new DecimalFormat(pattern);
		out = "";
		
		//output original Data
		out += "Original Data: " + "\n";
		out +=  origData[0];
		for(int i = 0; i < origData.length; i++) {
			out += ", " +  origData[i];
		}
		out += "\n";
		
		//output sorted Data
		out += "Sorted Data: " + "\n";
		out +=  sortedData[0];
		for(int i = 0; i < sortedData.length; i++) {
			out += ", " +  sortedData[i];
		}
		out += "\n";
		out += "Min value: " + df.format(min) + "\n";
		out += "Min value: " + df.format(min2) + "\n";
		out += "Max value: " + df.format(max) + "\n";
		out += "Max value: " + df.format(max2) + "\n";
		out += "Mean value: " + df.format(mean) + "\n";
		out += "Mean value: " + df.format(mean2) + "\n";
		//display objectCount

	}
}
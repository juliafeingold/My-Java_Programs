package as6;

import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		String in, out;
		
		//input array length
		in = JOptionPane.showInputDialog("Enter data size ");
		int dataLength = Integer.parseInt(in);
		
		//create the array
		double [] data = new double [dataLength];
		
		//populate the array
		for(int i = 0; i < dataLength; i++) {
			in = JOptionPane.showInputDialog("Enter data item ");
			data[i] = Double.parseDouble(in);
		}
		//create a statics object
		Statistics stat =  new Statistics(data);
		double[] origData = stat.findOrigData();
		double[] sortedData = stat.findSortedData(); 
		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		double median = stat.findMedian();
		
		//build output
		out = "Original Data: \n";
		out += origData[0];
		for(int i = 1; i < origData.length; i++) {
			out = out +  ", " + origData[i];
		}
		out += "Sorted Data: \n";
		out += sortedData[0];
		for(int i = 1; i < sortedData.length; i++) {
			out = out +  ", " + sortedData[i];
		}
		out += "Min: " + min + " \n";
		out += "Max: " + max + " \n";
		out += "Mean: " + mean + " \n";
		out += "Median: " + median + " \n";
		JOptionPane.showMessageDialog(null, out);
	}
		

}
	

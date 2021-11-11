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


package as6;

import java.util.Arrays;

public class Statistics {
	private double[] data;
	private double[] sdata;
	public Statistics (double[] d) {
		/*
		data = new double [d.length];
		System.arraycopy(d, 0, data, 0, d.length);
		*/
		data = d.clone();
		sdata = d.clone();
		Arrays.sort(sdata);
		
	}
	public double findMin() {
		double min;
		min = sdata[0];
		return min;
	}
	public double findMax() {
		double max;
		max = sdata[sdata.length - 1];
		return max;
	}
	public double findMean() {
		double mean, sum = 0;
		for(int i = 0; i < sdata.length; i++)
		{
			sum = sdata[i];
		}
		double avg = sum / sdata.length;
		return avg;
	}
	public double findMedian() {
		int loIndexMed, hiIndexMed, indexMed;
		double median;
		if((sdata.length % 2) == 0) { //even
			hiIndexMed = sdata.length / 2;
			loIndexMed = hiIndexMed - 1;
			median = (sdata[loIndexMed] + sdata[hiIndexMed]) / 2.0;
		}
		else {
			indexMed = sdata.length / 2;
			median = sdata[indexMed];
		}
		return median;
	}
	public double [] findOrigData() {
		double[] origData;
		origData =  data.clone();
		return origData;
	}
	public double [] findSortedData() {
		double[] sortedData;
		sortedData =  sdata.clone();
		return sortedData;
	}		
}
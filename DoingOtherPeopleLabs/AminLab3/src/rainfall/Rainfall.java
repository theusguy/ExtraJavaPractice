package rainfall;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Thursday (10/19)
Brief Description: Rainfall class blueprint. Contains constructor and 
necessary methods to add valid data.
*********************************************************************************/

public class Rainfall {
	protected double[] array = new double[12];
	
	//OG setArray method
	public void setArray(double element, int index) {
		try {
			if (index < 0 || index > 11) {
				throw new Exception();
			}
			if (element < 0.0) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Data out of range error. (Enter a postive number)");
		}
		array[index] = element;
	}
	//Overloaded setArray method
	public void setArray(double[] array) {
		try {
			for (int i = 0; i < array.length; i++) {
				if (array[i] < 0.0) {
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("Data out of range error. (Enter a positive number)");
		}
		this.array = array;
	}
	
	//total rainfall method
	public double totalRainfall() {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	//average rainfall method
	public double avgRainfall() {
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
		}
		return avg/array.length;
	}
	//least Rainfall month method
	public int leastRainfall() {
		double least = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < least) {
				least = array[i];
				index = i;
			}
		}
		return index;
	}
	
	//most Rainfall month method
	public int mostRainfall() {
		double most = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > most) {
				most = array[i];
				index = i;
			}
		}
		return index;
	}
	
	

}

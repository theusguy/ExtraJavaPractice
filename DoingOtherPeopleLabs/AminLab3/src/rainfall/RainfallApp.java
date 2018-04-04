package rainfall;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Thursday (10/19)
Brief Description: Business/Operations class. Making a Rainfall object
and displaying stats on console.
*********************************************************************************/

public class RainfallApp {
	public static void main(String[] args) {
		Rainfall rainfall = new Rainfall();
		double[] monthData = {10.0, 30.0, 35.0, 25.0, 20.0, 1.0, 15.0, 17.0, 25.0, 25.0, 30.0, 40.0};
		rainfall.setArray(monthData);
		
		System.out.println("Total Rainfall: " + rainfall.totalRainfall());
		System.out.println("Average Rainfall: " + rainfall.avgRainfall());
		System.out.println("Month (number) with least rainfall: " + rainfall.leastRainfall()+1);
		System.out.println("Month (number) with most rainfall: " + rainfall.mostRainfall()+1);
	}
}

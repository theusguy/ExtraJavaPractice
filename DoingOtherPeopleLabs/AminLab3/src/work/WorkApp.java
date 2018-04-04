package work;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Thursday (10/19)
Brief Description: Business/Operations class. Making a ProductionWorker object
and displaying stats on console.
*********************************************************************************/

public class WorkApp {
	public static void main(String[] args) {
		ProductionWorker worker = new ProductionWorker("Amin Khan", new String[] {"1", "2", "3", "B"}, new int[] {01, 01, 2018}, 1, 100000);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Code: " + worker.getEmployeeNum());
		System.out.println("Hired Date: " + worker.getDate());
		System.out.println("Shift Number: " + worker.getShift());
		System.out.println("Hourly Rate: " + worker.getPayRate());
		
		
	}

}

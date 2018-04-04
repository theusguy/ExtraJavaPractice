package work;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Thursday (10/19)
Brief Description: ProductionWorker class blueprint. Contains constructor and 
necessary methods to add valid data.
*********************************************************************************/

public class ProductionWorker extends Employee{
	int shift;
	double payRate;
	
	public ProductionWorker(String name, String[] employeeNum, int[] date, int shift, double payRate) {
		super(name, employeeNum, date);
		this.setShift(shift);
		this.setPayRate(payRate);
	}
	
	public void setShift(int shift) {
		try {
			if (!(shift == 1 || shift == 2)) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid shift number");
		}
		this.shift = shift;
	}
	
	public int getShift() {
		return shift;
	}
	
	public void setPayRate(double payRate) {
		try {
			if (payRate < 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid hourly pay rate");
		}
		this.payRate = payRate;
	}
	
	public double getPayRate() {
		return payRate;
	}

}

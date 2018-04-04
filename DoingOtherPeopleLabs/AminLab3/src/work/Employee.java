package work;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Thursday (10/19)
Brief Description: Employee class blueprint. Contains constructor and 
necessary methods to add valid data.
*********************************************************************************/

import java.util.Arrays;

public class Employee {
	String name;
	String[] employeeNum = {"X", "X", "X", "-", "L"};
	int[] date = {00, 00, 0000};
	
	public Employee(String name, String[] employeeNum, int[] date) {
		this.setName(name);
		this.setEmployeeNum(Integer.parseInt(employeeNum[0]), Integer.parseInt(employeeNum[1]), Integer.parseInt(employeeNum[2]), employeeNum[3]);
		this.setDate(date);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmployeeNum(int first, int second, int third, String letter) {
		try {
			if (first < 0 || first > 9) {
				throw new Exception();
			}
			if (second < 0 || second > 9) {
				throw new Exception();
			}
			if (third < 0 || third > 9) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Number part of Employee code out of range.");
		}
		String firstNum = Integer.toString(first);
		String secondNum = Integer.toString(second);
		String thirdNum = Integer.toString(third);
		employeeNum = new String[]{firstNum, secondNum, thirdNum, "-", letter};
	}
	
	public String getEmployeeNum() {
		return Arrays.toString(employeeNum);
	}
	
	public void setDate(int[] date) {
		try {
			if (date[0] < 0 || date[0] > 12) {
				throw new Exception();
			} 
			if (date[1] < 0 || date[1] > 31) {
				throw new Exception();
			}
			if (date[2] < 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Invalid Date Hired");
		}
		this.date = date;
	}
	
	public String getDate() {
		return Arrays.toString(date);
	}
}

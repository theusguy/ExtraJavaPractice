/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Thursday (9/21)
Brief Description: TestSCores Class Blueprint. Contains methods
to access and mutate the fields, a method to compute the average 
and another method to assign a letter grade.
*********************************************************************************/
public class TestScores {
	
	//Constructor
	public TestScores() {
		
	}
	public TestScores(int testScore1, int testScore2, int testScore3) {
		setTestScore1(testScore1);
		setTestScore2(testScore2);
		setTestScore3(testScore3);
	}
	
	//fields
	private int testScore1, testScore2, testScore3;
	private double avgHolder;
	
	//Mutator Methods
	public void setTestScore1(int score) {
		testScore1 = score;
	}
	
	public void setTestScore2(int score) {
		testScore2 = score;
	}
	
	public void setTestScore3(int score) {
		testScore3 = score;
	}
	
	//Accessor Methods
	public int getTestScore1() {
		return testScore1;
	}
	
	public int getTestScore2() {
		return testScore2;
	}
	
	public int getTestScore3() {
		return testScore3;
	}
	
	//Method to find avg
	public double average() {
		avgHolder = (double)(testScore1 + testScore2 + testScore3) / 3;
		return avgHolder;
	}
	
	//Method to compute grade
	public char grade() {
		if (avgHolder >= 90) {
			return 'A';
		} else if (avgHolder >= 80) {
			return 'B';
		} else if (avgHolder >= 70) {
			return 'C';
		} else if (avgHolder >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	

}

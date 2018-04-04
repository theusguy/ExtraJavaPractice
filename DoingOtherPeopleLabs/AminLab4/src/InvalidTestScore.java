/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Thursday (10/9)
Brief Description: Custom Exception class
*********************************************************************************/
public class InvalidTestScore extends Exception {
	public InvalidTestScore() {
		
	}
	
	public InvalidTestScore(String message) {
		super(message);
	}
}
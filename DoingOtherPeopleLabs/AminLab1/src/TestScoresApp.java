/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Thursday (9/21)
Brief Description: TestScores Driver Class. Instantiating a TestScores Object
and setting 3 test scores. Then computing average and letter grade.
*********************************************************************************/
import java.util.Scanner;

public class TestScoresApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner object to read user input
		TestScores score = new TestScores();	//Instantiating TestScores object to perform the logic
		
		int scoreHolder;
		
		//Asking the user three times for each test score
		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter the first score: ");
			scoreHolder = sc.nextInt();
			//Depending on what iteration for loop is on, it calls the corresponding mutator method
			if (i == 0) {
				score.setTestScore1(scoreHolder);
			} else if (i == 1) {
				score.setTestScore2(scoreHolder);
			} else {
				score.setTestScore3(scoreHolder);
			} //end if
		} //end for
		
		//Printing out the average of test scores
		System.out.println("Average: " + score.average());
		
		//Printing out letter Grade
		System.out.println("Grade: " + score.grade());
		
	}

}

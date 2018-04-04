/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Thursday (10/9)
Brief Description: Validator class to catch invalid data entry and throw exceptions
*********************************************************************************/
import java.util.*;

public class Validator {
	public static int checkRange(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;
		//To keep this going in loop till correct data
		while (!isValid) {
			try {
				System.out.println(prompt);
				//First to make sure input is even an int
				if (!sc.hasNextInt()) {
					throw new InvalidTestScore("Please enter a valid integer (0-100)");
				} else {
					data = sc.nextInt();
					//testing if in range
					if (data < 0 || data > 100) {
						throw new InvalidTestScore("Please enter an integer within range");
					} else {
						isValid = true;
					}
				}
			} catch (InvalidTestScore e) {
				System.out.println(e);
				sc.nextLine(); //Clear buffer
			}
		}
		return data;
	}

}

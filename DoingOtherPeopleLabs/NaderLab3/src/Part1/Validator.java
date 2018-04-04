package Part1;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 1
Description: Is the Validator class that validates the user data
 */
public class Validator { // Validator Class
	public boolean isValid(String value1) { //
		try {
			int value = Integer.parseInt(value1); // value for value is cast of
													// string to int
			return true; // brings true if data is correct
		} catch (Exception e) {
			System.out.println("This value is not valid:" + value1); // value
																		// for
																		// value
																		// 1 is
																		// incorrect
																		// print
																		// statement

			return false; // brings false if data isn't correct format
		}
	}
}

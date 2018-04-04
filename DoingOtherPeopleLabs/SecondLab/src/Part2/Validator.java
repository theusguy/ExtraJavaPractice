package Part2;

/*********************************************************************************
Name: Nikhil Sharma
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Validator making sure inputs ar evalid and not negative
*********************************************************************************/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Validator {
	
	double min = 0;
	
	
	public static double validateValue(String prompt) {
		boolean isValid = false;
		double num = 0;
		
		
		String input;
		
		while(!isValid) {
			try {
				input = JOptionPane.showInputDialog(prompt);
				if (!isDouble(input)) {
					
				} else {
					num = Double.parseDouble(input); //Receive Double
					
					if (!inRange(num)) {
						throw new Exception();
					} 
				} //end outer if
				isValid = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Values must be postive!");
			}
		} //end while
		return num;
	} //end of validateDouble()
	
	public static boolean isDouble(String s) {
	    try { 
	        Double.parseDouble(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public static boolean inRange(double num) {
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}
}

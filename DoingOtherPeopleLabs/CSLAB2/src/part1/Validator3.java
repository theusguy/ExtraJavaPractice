package part1;

/*********************************************************************************
Name: Nader Javid
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Utility class used to validate data inputed from user before
passing it to FutureValueBigDecimal Object. Purpose is to handle exceptions and input 
errors that can be produced as well as making sure data is in range.
*********************************************************************************/

import javax.swing.JOptionPane;

public class Validator3 {
	public static double validateDoubleWithRange(String prompt, double min, double max) {
		boolean isValid = false;
		double data = 0.0;
		
		String input;
		
		while(!isValid) {
			try {
				input = JOptionPane.showInputDialog(prompt);
				if (!isDouble(input)) {
					throw new NumberFormatException();
				} else {
					data = Double.parseDouble(input); //Receive Double
					
					if (data < min) {
						throw new Exception();
					} else if (data > max) {
						throw new Exception();
					} //end inner if
				} //end outer if
				isValid = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Data input error. Please enter a decimal data...");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data input error. Please check the data and try again...");
				
			}
		} //end while
		return data;
	} //end of validateDouble()
	
	//MEthod of validateInt() with range
	public static int validateIntWithRange(String prompt, int min, int max) {
		boolean isValid = false;
		int data = 0;
		
		String input;
		while(!isValid) {
			try {
				input = JOptionPane.showInputDialog(prompt);
				if (!isInteger(input)) {
					throw new NumberFormatException();
				} else {
					data = Integer.parseInt(input);
					
					if (data < min) {
						throw new Exception();
					} else if (data > max) {
						throw new Exception();
					}
					
					isValid = true;
				} //end outer if/else 
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "\nData input error. Please enter an integer...");
				
			} catch (Exception e) {
				System.out.println("\nInput data out of the range error. Please check the data and try again...");
				
			}
		} //end while
		return data;
	} //end of validateInt();
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
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
//	//Method of inRange()
//	private static boolean inRange(double num) {
//		if (num >= 0.0) {
//			return true;
//		} else {
//			return false;
//		}
//	} //end inRange

}

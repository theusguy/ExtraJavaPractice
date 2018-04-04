package part2;

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

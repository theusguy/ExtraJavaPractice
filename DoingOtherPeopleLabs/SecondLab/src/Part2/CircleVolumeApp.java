package Part2;

/*********************************************************************************
Name: Nikhil Sharma
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Class that runs this program (main)
*********************************************************************************/
import java.util.Scanner;

import javax.swing.JOptionPane;


public class CircleVolumeApp {
	public static void main(String[] args) {
		String choice = "y";
		
		double first,
			   second,
			   third;
		
		double answer;
		
		boolean keepGoing = false;
		
		CircularVolume sample = new CircularVolume();
		
		while(choice.equalsIgnoreCase("y")) {

			first = Validator.validateValue("Enter first value: (Skip if theres no value)");
			sample.setFirst(first);

			second = Validator.validateValue("Enter second value: (Skip if theres no value)");
			sample.setSecond(second);

			third = Validator.validateValue("Enter third value: (Skip if theres no value)");
			sample.setThird(third);

			sample.setType();
			
			answer = sample.volumeHolder;
			
			JOptionPane.showMessageDialog(null, "Your object: " + sample.getName() + "\n" + "Radius: " + sample.getFirst()  + "\n" + "Height: " + sample.getSecond() + "\n" + "ThirdValue: " + sample.getThird() + "\n" + "Volume: " + answer);
			
			do {
				choice = JOptionPane.showInputDialog("Contine?(y/n): ");

				if (choice.equalsIgnoreCase("n")) {
					keepGoing = true;
				} else if (choice.equalsIgnoreCase("y")) {
					keepGoing = true;
				}
				
			} while (!keepGoing);
			
			keepGoing = false;
			
	 	} //End of while

	 	JOptionPane.showMessageDialog(null, "Good bye!");
	}

}

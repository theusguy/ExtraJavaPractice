package Part1;

/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 1
Description: Is the driver class that has the main method and the objects of all the other classes
 */
import java.util.Scanner; //import Scanner class

public class AreaAndVolumeApp extends Validator{
	public static void main(String[] args) {
		boolean t = true;
		while (t) {
			System.out.println("Please enter the object type you would like to compute the area/surface area/volume for:");
			System.out.println("Options: rectangle, square, cube, rectangle prism.");
			Validator valid = new Validator(); // Validator object
			Scanner scan = new Scanner(System.in); // Scanner object
			String UserInput = scan.next(); // getting string input and storing
											// in
											// variable UserInput
			if (UserInput.equalsIgnoreCase("square")) { // If the value of
														// userinput
														// is square
				SubSubAreaAndVolume area = new SubSubAreaAndVolume(); // object
																		// of
																		// subclass
																		// of
																		// SubAreaAndVolume
				System.out
						.println("Please enter the value for the side of the square");
				String side = scan.next(); // storing value in variable called
											// side
				if (!valid.isValid(side)) {
					System.out.println("Enter the valid data"); // print data
					side = scan.next(); // storing value in variable side
					System.out.println("This is the square area:"
							+ area.area(Integer.parseInt(side))); // printing
																	// the
																	// area
				} else {
					System.out.println("This is the square area:"
							+ area.area(Integer.parseInt(side))); // printing
																	// the
																	// area
					t = false;
				}

			} else if (UserInput.equalsIgnoreCase("rectangle")) {
				SubSubAreaAndVolume area = new SubSubAreaAndVolume(); // object
																		// of
																		// subclass
																		// of
																		// SubAreaAndVolume
				System.out
						.println("Please enter the value for the length of the rectangle");
				String length = scan.next(); // store value in length
				if (!valid.isValid(length)) {
					System.out.println("Enter the valid data");
					length = scan.next(); // store value in length
				}

				System.out
						.println("Please enter the value for the width of the rectangle prism");
				String width = scan.next();// store value in width
				if (!valid.isValid(width)) {
					System.out.println("Enter the valid data");
					width = scan.next(); // store value in width
				}
				System.out.println("This is the rectangle area:"
						+ area.arearect(Integer.parseInt(length),
								Integer.parseInt(width))); // printing area of
															// rectangle
				t = false;
			} else if (UserInput.equalsIgnoreCase("rectangle prism")) {
				SubSubAreaAndVolume area = new SubSubAreaAndVolume();
				System.out
						.println("Please enter the value for the length of the rectangle prism");
				String length = scan.next();// store value in length
				if (!valid.isValid(length)) {
					System.out.println("Enter the valid data");
					length = scan.next(); // store value in length
				}

				System.out
						.println("Please enter the value for the width of the rectangle prism");
				String width = scan.next(); // store value in width
				if (!valid.isValid(width)) {
					System.out.println("Enter the valid data");
					width = scan.next(); // store value in width
				}
				System.out
						.println("Please enter the value for the height of the rectangle prism");
				String height = scan.next(); // store value in height
				if (!valid.isValid(height)) {
					System.out.println("Enter the valid data");
					height = scan.next(); // store value in height
				}
				System.out
						.println("The surface area of the rectangular prism is"
								+ area.surfacearearect(
										Integer.parseInt(length),
										Integer.parseInt(width),
										Integer.parseInt(height))); // print
																	// surface
																	// are
																	// of
																	// rectangular
																	// prism
				System.out.println("The volume of the rectangular prism is"
						+ area.volumerect(Integer.parseInt(length),
								Integer.parseInt(width),
								Integer.parseInt(height))); // print
															// volume
															// of
															// rectangular
															// prism
				t = false;

			} else if (UserInput.equalsIgnoreCase("cube")) {
				SubSubAreaAndVolume area = new SubSubAreaAndVolume(); // object
																		// of
																		// the
																		// subclass
																		// of
																		// SubAreaAndVolume
				System.out
						.println("Please enter the value for the side of the cube");
				String side = scan.next(); // store value in variable side
				if (valid.isValid(side)) {
					System.out.println("This is the cube's surface area:"
							+ area.surfacearea(Integer.parseInt(side)));
					System.out.println("This is the cube's volume:"
							+ area.volumecube(Integer.parseInt(side)));
					t = false;
				} else {
					System.out.println("Enter the valid data");
					side = scan.next(); // store value in variable side
					System.out.println("This is the cube's surface area:"
							+ area.surfacearea(Integer.parseInt(side)));
					System.out.println("This is the cube's volume:"
							+ area.volumecube(Integer.parseInt(side)));
					t = false;

				}

			} else {
				System.out.println("Please enter one of the options!");

			}
		}

	}
}


package Part1;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 1
Description: Is the business class that has methods for calculating area and volume
 */
public class SubAreaAndVolume extends AreaAndVolume {

	public static void main(String[] args) {
		SubAreaAndVolume a = new SubAreaAndVolume(); // create object of class
														// of SubAreaAndVolume
		int side = 0; // intialize variable side
		System.out.println("This is the square area:" + a.area(side)); // print
																		// the
																		// area
		int length = 0; // intialize variable length
		int width = 0; // intialize variable width
		System.out.println("This is the rectangle are:"
				+ a.arearect(length, width)); // print the arearect

	}

	public String surfacearea(int side) { // declare method surfacearea
		int surfaceArea = 6 * side * side; // declare intialization of formula
											// for
											// surfaceArea
		return Integer.toString(surfaceArea); // allow surfaceArea to made to
												// string
	}

	public String surfacearearect(int length, int width, int height)// declare
																	// method
																	// surfaceacrearect
	{
		int surfaceAreaRect = 2 * length * width + 2 * width * height + 2
				* length * height; // declare the method
		return Integer.toString(surfaceAreaRect); // return string
	}

	public String volumecube(int side) { // declare the volumecube method
		int volumecube = (int) Math.pow(side, 3); // intialize the volumecube
		return Integer.toString(volumecube); // make volumecube string
	}

	public String volumerect(int length, int width, int height) { // declaring
																	// the
																	// volumerect
																	// method
		int volumerect = length * width * height; // declare variable with
													// formula
		return Integer.toString(volumerect); // make toString for value of
												// volumerect
	}

}
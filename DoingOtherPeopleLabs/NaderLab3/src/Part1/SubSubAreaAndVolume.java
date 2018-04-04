package Part1;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 1
Description: Is the business class that has methods for calculating area and volume
 */
public class SubSubAreaAndVolume extends SubAreaAndVolume { // class declaration

	public static void main(String[] args) {
		SubSubAreaAndVolume area = new SubSubAreaAndVolume(); // object of
																// subclass of
																// SubAreaAndVolume
		int side = 0; // Initialize variables
		System.out.println("This is the volume of a cube"
				+ area.volumecube(side)); // print volume of cube
		int length = 0;// Initialize variables
		int width = 0;// Initialize variables
		int height = 0;// Initialize variables
		System.out.println("This is the volume of a rectangular prism" + area.volumerect(length, width, height));// print volume of rectangular prism
		System.out.println("This is the surface area of a cube" + area.surfacearea(side)); // print surface area of cube
		System.out.println("This is the surface area of a rectangular prism" + area.surfacearearect(length, width, height)); // print surface area of rectangular prism

	}

}

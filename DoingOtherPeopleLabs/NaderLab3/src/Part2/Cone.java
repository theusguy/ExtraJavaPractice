package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 1
Description: Is the business class that has methods for calculating area and volume of cone
 */
import java.util.Scanner;

public class Cone extends Circle {
	protected static double height; //declaration of variables
	protected static double radius;

	public Cone() { //constructor
		super();
	}

	public Cone(double radius, double height) { //constructor
		super(radius);
		this.height = height;
		this.radius = radius;
	}

	public Cone(double x1, double y1, double x2, double y2) { //constructor
		super(x1, y1, x2, y2);// call super class four-argument constructor
	}

	public void computeArea() { // compute cones's area 
		super.computeArea();// call super class' method
		area = Math.PI * radius * (radius + Math.sqrt(height + radius)); //formula for area of cone
	}

	public void computeVolume() { // compute cones's volume
		super.computeArea();
		volume = height / 3 * area;

	}
	public String toString() {					//override the toString() method
		 return  "Cone Area: " + area + "\n"+"Cone Volume:"+ volume;
		 
	  }

	public static void main(String[] args) { //main method
		System.out.println("Please enter the radius.");
		Scanner scan = new Scanner(System.in);
		Validator valid = new Validator();
		String radius1 = scan.next();
		while(!valid.isValid(radius1)){ //validating the data
			System.out.println("Please enter the radius again.");
			radius1 = scan.next();
		}
		radius = Double.parseDouble(radius1);
		System.out.println("Please enter the height.");
		String height1 = scan.next();
		while(!valid.isValid(height1)){ //validating the data
			System.out.println("Please enter the height again.");
			height1 = scan.next();
		}
		height = Double.parseDouble(height1);
		Cone cone = new Cone(radius,height);
		cone.computeArea();
		cone.computeVolume();
		System.out.println(cone.toString());
		
		
		
	}
}
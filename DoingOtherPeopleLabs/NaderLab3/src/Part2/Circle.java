package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 2
Description: Is the class student used to make program (Made by teacher), contains methods for Circle area and volume
 */
//subclass class Circle

public class Circle extends CircleShape2 {
	protected double area;
	protected double volume;

	public Circle() {
		super(); // call super class non-argument constructor
		area = 0;
		volume = 0;
	}

	public Circle(double radius) {
		super(radius); // call super class one-argument constructor
	}

	public Circle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);// call super class four-argument constructor
	}

	public void computeArea() {
		area = Math.PI * radius * radius;
	}

	public double getArea() {
		return area;
	}

	public void computeVolume() {
	} // must implement

	public double getVolume() {
		return volume;
	}

	public String toString() { // override the toString() method
		return super.toString() + "Circle Area: " + area + "\n";
	}

}
package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 2
Description: Is the class student used to make program (Made by teacher), used as superclass
 */
//abstract class Shape

public abstract class Shape {
	protected double x1, y1, x2, y2;
	public Shape() { //constructor where radius = 0
		x1 = y1 = x2 = y2 = 0.0;
	}
	public Shape(double x1, double y1, double x2, double y2) { //given points to find radius
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

	public String toString() {
		String message = "(" + x1 + "," + y1 + "), ("
		 		+ x2 + "," + y2 + ")\n";
		 return message;
		 }

	public abstract void computeArea();		//abstract methods
	public abstract void computeVolume();
	public abstract double getArea();
	public abstract double getVolume();
}
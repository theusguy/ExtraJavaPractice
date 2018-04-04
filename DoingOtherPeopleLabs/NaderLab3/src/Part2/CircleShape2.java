package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 2
Description: Is the abstract class student used to make program (Made by teacher), contains abstract methods for program
 */
//abstract class CircleShape2

public abstract class CircleShape2 extends Shape {		//Inherits Shape
	protected double radius;

public CircleShape2() { //radius == 0
	x1 = y1 = x2 = y2 = 0.0;
	}
public CircleShape2(double x1, double y1, double x2, double y2) { //constructor where points given
		super(x1, y1, x2, y2);
	}
public CircleShape2(double radius) { //constructor for radius given
	 	this.radius = radius;
	}
	public void setRadius(double radius) { //set Radius to class value
		this.radius = radius;
	}
	public double getRadius() { //return radius value
		return radius;
	}
	public void computeRadius() { //get radius based on points
		radius = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	public String toString() { //toString overloading
		return super.toString() + "Radius: " + radius + "\n";
	}
}

package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 2
Description: Is the driver class that runs methods for calculating area and volume
 */

public class CircleShapeApp{ //class declaration

	public static void main(String[] args) {
 		Circle circle = new Circle(12.98);//creation of Circle object
 		Sphere sphere = new Sphere(25.55); //creation of Sphere object
 		Cone cone = new Cone(5.28,12.5); //creation of Cone object

 		Shape shape = circle; //declaring class variable to Circle

 		shape.computeArea(); //running formula for circle area
 		System.out.println("circle area: " + shape.getArea());
 		shape.computeVolume(); //running formula for circle area
 		System.out.println("circle volume: " + shape.getVolume());

		shape = sphere; //declaring class variable to Sphere
 		shape.computeArea();//running formula for sphere area
 		System.out.println("Sphere area: " + shape.getArea());
 		shape.computeVolume();//running formula for sphere area
 		System.out.println("Sphere volume: " + shape.getVolume());
 		
 		shape = cone; //declaring class variable to Cone
 		shape.computeArea(); //running formula for area
 		System.out.println("Cone area: " + shape.getArea());
 		shape.computeVolume(); //running formula for volume
 		System.out.println("Cone volume: " + shape.getVolume());
 		
 	}

}
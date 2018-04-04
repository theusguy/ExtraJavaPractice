package area;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 2
Submission Date: 10:00 pm, Thursday (10/5)
Brief Description: Business/Operations class. Contains overloaded static methods
all finding area of a shape but each focuses on a specific shape. Shapes include
circle, rectangle, and cylinder.
*********************************************************************************/

public class Area {
	
	//circle
	public static double area(double radius) {
		return (Math.PI * radius * radius);
	}
	
	//rectangle
	public static double area(int length, int width) {
		return (length * width);
	}
	
	//cylinder
	public static double area(double radius, double height) {
		return (Math.PI * radius * radius * height);
	}

}

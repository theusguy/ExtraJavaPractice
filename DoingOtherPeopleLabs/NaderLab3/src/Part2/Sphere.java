package Part2;
/*
Name : Taj Shaik
Class : Java Programming
Section : CS-170
Assignment #3 : Lab #3 Part 2
Description: Is the class student used to make program (Made by teacher), contains methods for Sphere
 */
//subclass class Sphere inherites Circle

 class Sphere extends Circle{
	public Sphere() {
		super();			//call super class non-argument constructor
	}
	public Sphere(double radius) {
		super(radius);		//call super class one-argument constructor
	}
	public Sphere(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);//call super class four-argument constructor
	}

	public void computeArea() {		//compute sphere's area
		super.computeArea();		//call super class' method
		area = 4* area;
	}

	public void computeVolume() {	//compute sphere's valume
		super.computeArea();
		volume = 4.0/3 * radius * area;
	}
}
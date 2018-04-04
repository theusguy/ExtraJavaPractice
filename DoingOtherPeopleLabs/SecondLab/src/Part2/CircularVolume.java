package Part2;

/*********************************************************************************
Name: Nikhil Sharma
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Class Blueprint
*********************************************************************************/

public class CircularVolume {
	double first,
	second,
	third,
	type,
	volumeHolder;

String name;

public CircularVolume() {
this.first = 0;
this.second = 0;
this.third = 0;
}



public void setFirst(double f) {
this.first = f;
}

public double getFirst() {
return first;
}

public void setSecond(double s) {
this.second = s;
}

public double getSecond() {
return second;
}

public void setThird(double t) {
this.third = t;
}

public double getThird() {
return third;
}

public String getName() {
return name;
}

public void setType() {
if (first > 0 && second == 0 && third == 0) {
	name = "Sphere";
	type = 1;
	volumeHolder = this.findVol(first);
} else if (first > 0 && second > 0 && third == 0) {
	name = "Cylinder";
	type = 2;
	volumeHolder = this.findVol(first, second);
} else if (first > 0 && second > 0 && third > 0) {
	name = "Ellipsoid";
	type = 3;
	volumeHolder = this.findVol(first, second, third);
} else {
	type = 0;
}
}



public double findVol(double first) {
return ( (4/3) * Math.PI * Math.pow(first, 3) );
}

public double findVol(double first, double second) {
return ( Math.PI * Math.pow(first, 2) * second );
}

public double findVol(double first, double second, double third) {
return ( (4/3) * Math.PI * first * second * third);
}



}

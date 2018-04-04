package Part1;
/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 1
Description: The driver class which will run the program and has the
objects of class ConvTemp.
*/

public class ConvTempApp
{
 public static void main(String[] args)
 {
      ConvTemp converter = new ConvTemp();

      System.out.println("Welcome to the Temperature Converter:");

      // Calling method from class Converter to take Temperature Value
      converter.takeTempValue();

      // Calling method from class Converter to convert Temperature Value
      converter.convertTempValue();

      // Calling method from class Converter to print Temperature Value
      converter.printTempValue();
  }
}

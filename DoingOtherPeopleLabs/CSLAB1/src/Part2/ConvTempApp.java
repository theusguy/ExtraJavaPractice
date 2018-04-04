package Part2;

/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 1
Description: The driver class which will run the program and has the
objects of class ConvTemp.
*/

import java.util.Scanner;

public class ConvTempApp
{
  public static void main(String[] args)
  {
    ConvTemp converter = new ConvTemp();
    Scanner sc = new Scanner(System.in);
    String usercontinue = "y";

    System.out.println("Welcome to the Temperature Converter:");

    // Start do while loop
    do
    {
      // Calling method from class Converter to take Temperature Value
      converter.takeTempValue();

      // Calling method from class Converter to convert Temperature Value
      converter.convertTempValue();

      // Calling method from class Converter to print Temperature Value
      converter.printTempValue();

      System.out.print("Continue? (Y/N): ");
      usercontinue = sc.next(); // User input

      // Check if user said no
      if(usercontinue.equalsIgnoreCase("n") || (usercontinue.equalsIgnoreCase("N")))
      {
        System.exit(0); // Exit
      }

    }
    while (usercontinue.equalsIgnoreCase("y") || (usercontinue.equalsIgnoreCase("Y")));
  }
}
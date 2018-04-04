package Part1;

/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 1
Description: The class that contains all of the information (back-end code)
and will support the driver code in the driver program.
*/

// Import statement
import java.util.Scanner;

public class ConvTemp
{
    // Create object of Scanner class
    Scanner sc = new Scanner(System.in);

    // Declare variables
    double inputTemp;
    double cTemp;
    double fTemp;

    // Method to get temp values
    public void takeTempValue()
    {
      System.out.print("Enter a temperature: ");
      // Store user input
      inputTemp = sc.nextInt();
    }

    // Method to convert temp
    public void convertTempValue()
    {
      cTemp = 5 * (inputTemp - 32) / 9;
      fTemp = (inputTemp * 9 / 5) + 32;
    }

    // Method to print temp
    public void printTempValue()
    {
      System.out.println("Temperature in Celsius: " + cTemp);
      System.out.println("Temperature in Fahrenheit: " + fTemp);
    }
}

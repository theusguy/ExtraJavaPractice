package Part2;
/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 2
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
    String userInput;

    // Method to get temp values
    public void takeTempValue()
    {
      System.out.println("Enter the temperature: ");
      inputTemp = sc.nextInt();
      System.out.println("Would you like the temperature in Celsius or Fahrenehit? (C/F):" );
      userInput = sc.next();
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
      if(userInput.equals("C"))
      {
        System.out.println("Temperature in Celsius: " + cTemp);
      }
      else if (userInput.equals("F"))
      {
        System.out.println("Temperature in Fahrenheit: " + fTemp);
      }
    }
}
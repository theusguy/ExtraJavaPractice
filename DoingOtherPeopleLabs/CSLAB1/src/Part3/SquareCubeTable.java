package Part3;

/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 3
Description: A class in which there are methods to process and print the a table
containing the square and cube of the numbers from 1 to 10.
*/

public class SquareCubeTable
{
  public void printSquareCubeTable()
  {
    // Header of table
    System.out.println("Number" + "\t" + "Square" + "\t" + "Cube");

    // for loop to print each loop
    for (int i = 1; i <= 10; i++)
    {
      // int cast to print int values
      int square = (int) Math.pow(i, 2);
      int cube = (int) Math.pow(i, 3);

      // Using escape sequence for formatting
      System.out.println(i + "\t" + square + "\t" + cube);
    }
  }
}
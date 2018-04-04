package Part4;

/*
Name: Nader Javid
Class: Java Programming
Section: CS-170
Assignment #1: Lab #1 Part 4
Description: A driver class to test and print the table of squares and cubes
*/

import java.util.Scanner;

public class SquareCubeTableApp
{
  public static void main(String[] args)
  {
    int num1;
    int num2;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    num1 = sc.nextInt();

    System.out.println("Enter the second number: ");
    num2 = sc.nextInt();

    // Instantiate method
    SquareCubeTable s = new SquareCubeTable();

    // Call method
    s.printSquareCubeTable(num1, num2);
  }
}

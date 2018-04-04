package sumOfNumbers;

/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Thursday (10/5)
Brief Description: Driver class. Prompts user to enter a nonzero positive integer
then after verifying input, it finds the sums up to that number.
*********************************************************************************/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumOfNumbersApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Total = -1 as a way of finding out if input was a negative number
		int num = 0, total = -1;
		
		//Prompting user to enter int
		System.out.println("Please enter a nonzero positive integer: ");
		//Making sure input is in fact an int
		while (!sc.hasNextInt()) {
			System.out.println("Data Input Error! Please enter a nonzero positive integer only");
			sc.nextLine();
		} 
		
		num = sc.nextInt();
		
		//Now making sure that if int is in within range
		while (total == -1) {
			System.out.println("Please enter a nonzero positive intege only");
			sc.nextLine();
			num = sc.nextInt();
			for (int i = 0; i <= num; i++) {
				total += i;
			}
		}
			
		
		
		System.out.println("Sum total: " + (total + 1));
		
		
		
		
	}

}

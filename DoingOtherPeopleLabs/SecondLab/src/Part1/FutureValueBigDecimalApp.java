package Part1;

/*********************************************************************************
Name: Nikhil Sharma
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Class that runs this program (main)
*********************************************************************************/

import java.math.BigDecimal;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class FutureValueBigDecimalApp {
	public static void main(String[] args) {

		String choice = "y",
			   userName;
		double monthlyInvestment,
		       yearlyReturnRate;
		int    investYears;
		final int minYear = 1,
				  maxYears = 150;
		final double minPercent = 0.1,
				 maxPercent = 35,
				 minInvest = 1,
				 maxInvest = 1000000;

		String 	rateStr,
				investStr,
				futureValueStr;

		boolean continueyorn = false;


	
	FutureValueBigDecimal futureValue = new FutureValueBigDecimal();  //Create the object

	while(choice.equalsIgnoreCase("y")) {

		userName = JOptionPane.showInputDialog("Please enter your name: ");
		futureValue.setName(userName);
		
		monthlyInvestment = Validator.validateDouble("Your monthly invest: ", minInvest, maxInvest);
		futureValue.setMonthlyInvest(monthlyInvestment);

		yearlyReturnRate = Validator.validateDouble("Interest rate: ", minPercent, maxPercent);
		futureValue.setYearlyRate(yearlyReturnRate);

		investYears = Validator.validateInt("Invest years: ", minYear, maxYears);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();

		//Formatted output for currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMinimumFractionDigits(3);
		investStr = currency.format(futureValue.getMonthlyInvest());
		futureValueStr = currency.format(futureValue.getFutureValue());

		//Formatted output for perceent
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(3);
		rateStr = percent.format(futureValue.getYealyRate().divide(new BigDecimal(100)));

		JOptionPane.showMessageDialog(null, "Your name: " + futureValue.getName() + "\n" + "Invest amount: " + investStr  + "\n" + "Interest rate: " + rateStr + "\n" + "Invest years: " + futureValue.getYears() + "\n" + "Future value: " + futureValueStr);
		
		do {
			choice = JOptionPane.showInputDialog("Contine?(y/n): ");

			if (choice.equalsIgnoreCase("n")) {
				continueyorn = true;
			} else if (choice.equalsIgnoreCase("y")) {
				continueyorn = true;
			}
			
		} while (!continueyorn);
		
		continueyorn = false;
 	} //End of while

 	System.out.println("Good bye!");
  } //End of main()

}

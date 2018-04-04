package part1;

/*********************************************************************************
Name: Nader Javid
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Driver class that runs the FutureValue program to prompt 
user for Investment Data. It then validates the code and then saves it in 
FutureValueBigDecimal Object for organization and calculation.
*********************************************************************************/

import java.math.BigDecimal;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class FutureValueBigDecimalApp {
	public static void main(String[] args) {

		String choice = "y",
			   userName;
		double monthlyInvestment,
		       yearlyReturnRate;
		int    investYears;
		final int minYear = 1,
				  maxYears = 120;
				  
		final double minPercent = 0.1,
					 maxPercent = 35,
					 minInvest = 1,
					 maxInvest = 1000000;

		String 	rateStr,
				investStr,
				futureValueStr;
		
		boolean continueValidate = false;

	FutureValueBigDecimal futureValue = new FutureValueBigDecimal();  //Create the object

	while(choice.equalsIgnoreCase("y")) {

		userName = JOptionPane.showInputDialog("Please enter your name: ");
		futureValue.setName(userName);				//Set name

		monthlyInvestment = Validator3.validateDoubleWithRange("Your monthly invest: ", minInvest, maxInvest);
		futureValue.setMonthlyInvest(monthlyInvestment);

		yearlyReturnRate = Validator3.validateDoubleWithRange("Interest rate: ", minPercent, maxPercent);
		futureValue.setYearlyRate(yearlyReturnRate);

		investYears = Validator3.validateIntWithRange("Invest years: ", minYear, maxYears);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();

		//Formatted output for currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMinimumFractionDigits(3);
		investStr = currency.format(futureValue.getMonthlyInvest());
		futureValueStr = currency.format(futureValue.getFutureValue());

		//Formatted output for percent
		NumberFormat percent = NumberFormat.getPercentInstance();
		BigDecimal divider = new BigDecimal(100);
		percent.setMinimumFractionDigits(3);
		rateStr = percent.format(futureValue.getYearlyRate().divide(divider));

		JOptionPane.showMessageDialog(null, "Your name: " + futureValue.getName() + "\n" + "Invest amount: " + investStr  + "\n" + "Interest rate: " + rateStr + "\n" + "Invest years: " + futureValue.getYears() + "\n" + "Future value: " + futureValueStr);
		
		do {
			choice = JOptionPane.showInputDialog("Contine?(y/n): ");

			if (choice.equalsIgnoreCase("n")) {
				continueValidate = true;
			} else if (choice.equalsIgnoreCase("y")) {
				continueValidate = true;
			}
			
		} while (!continueValidate);
		
		continueValidate = false;
		
 	} //End of while

 	JOptionPane.showMessageDialog(null, "Good bye!");
  } //End of main()

}

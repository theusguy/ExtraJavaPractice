package part1;

/*********************************************************************************
Name: Nader Javid
Course: CS170
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (2/28)
Brief Description: Operation class used to set and get different data about user's
investment and methods to calculate investment returns.
*********************************************************************************/

import java.math.BigDecimal;

public class FutureValueBigDecimal {
	private String name;			//Declare instance variables
	private BigDecimal years = new BigDecimal(0);
	private BigDecimal  monthlyInvest = new BigDecimal(0.0);
	private	BigDecimal yearlyRate = new BigDecimal(0.0);
	private	BigDecimal futureValue = new BigDecimal(0.0);

	//following are setXx() and getXxx() for class variables
	public void setName(String userName) {
		name = userName;
	}
	public String getName() {
		return name;
	}

	public void setMonthlyInvest(double monthlyInvestment) {
		BigDecimal monthlyInvestmentBig = new BigDecimal(monthlyInvestment);
		monthlyInvest = monthlyInvestmentBig;
	}
	public BigDecimal getMonthlyInvest() {
		return monthlyInvest;
	}
	public void setYearlyRate(double yearlyReturnRate) {
		BigDecimal yearlyReturnRateBig = new BigDecimal(yearlyReturnRate);
		yearlyRate = yearlyReturnRateBig;
	}
	public BigDecimal getYearlyRate() {
		return yearlyRate;
	}
	public void setYears(int investYears){
		BigDecimal investYearsBig = new BigDecimal(investYears);
		years = investYearsBig;
	}
	public BigDecimal getYears() {
		return years;
	}
	public BigDecimal getFutureValue() {
		return futureValue;
	}
	public void futureValueCompute() {  //Method to compute the future value
		BigDecimal monthlyReturnRate = new BigDecimal(yearlyRate.doubleValue()/12/100);
		BigDecimal monthlyCalcRate = new BigDecimal(monthlyReturnRate.intValue() + 1);
		int months = years.intValue() * 12;
		int i = 1;
		do  {
			futureValue = (futureValue.add(monthlyInvest));
			futureValue = futureValue.multiply(monthlyCalcRate);
			i++;
		}	while (i <= months);		//End of do-while
	}		   				//End of the method

}

package Part1;

import java.math.BigDecimal;

public class FutureValueBigDecimal {
	private String name;			//Declare instance variables
	private BigDecimal years;
	private BigDecimal  monthlyInvest,
		 	yearlyRate,
		 	futureValue = new BigDecimal(0);

	//following are setXx() and getXxx() for class variables
	public void setName(String userName) {
				name = userName;
			}
	public String getName() {
				return name;
			}

	public void setMonthlyInvest(double monthlyInvestment) {
				monthlyInvest = new BigDecimal(monthlyInvestment);
			}
	public BigDecimal getMonthlyInvest() {
				return monthlyInvest;
			}
	public void setYearlyRate(double yearlyReturnRate) {
				yearlyRate = new BigDecimal(yearlyReturnRate);
			}
	public BigDecimal getYealyRate() {
				return yearlyRate;
			}
	public void setYears(int investYears){
				years = new BigDecimal(investYears);
			}
	public BigDecimal getYears() {
				return years;
			}
	public BigDecimal getFutureValue() {
				return futureValue;
			}
	public void futureValueCompute() {  //Method to compute the future value
				BigDecimal monthlyReturnRate = new BigDecimal(yearlyRate.doubleValue()/12/100);
				int months = years.intValue() * 12;
				int i = 1;
				do  {
					futureValue = (futureValue.add(monthlyInvest).multiply(monthlyReturnRate.add(new BigDecimal(1))));
					i++;
		 		}	while (i <= months);		//End of do-while
	}		   				//End of the method

}

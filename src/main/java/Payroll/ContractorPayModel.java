package Payroll;

//Calculates pay based on the contractor model
public class ContractorPayModel implements PayModel {
	
	@Override
	public double getWeeklyPay(double hourlyRate, double weeklyHoursWorked) {
		if (hourlyRate > 0 && weeklyHoursWorked > 0) {
			return hourlyRate * weeklyHoursWorked;
		}	
		
		return 0;
	}
	
}

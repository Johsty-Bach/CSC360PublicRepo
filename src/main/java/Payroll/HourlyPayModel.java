package Payroll;

//Calculates pay based on the hourly model
public class HourlyPayModel implements PayModel {

	@Override
	public double getWeeklyPay(double hourlyRate, double weeklyHoursWorked) {
		if (hourlyRate > 0 && weeklyHoursWorked > 0) {
			return Math.max(0, (weeklyHoursWorked - 40)) * hourlyRate * 1.5 + Math.min(40, weeklyHoursWorked) * hourlyRate;
		}	
		
		return 0;
	}

}

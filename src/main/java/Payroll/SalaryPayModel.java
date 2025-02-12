package Payroll;

//Calculates pay based on the salary model
public class SalaryPayModel implements PayModel {

	@Override
	public double getWeeklyPay(double hourlyRate, double weeklyHoursWorked) {
		return Math.max(0, 40 * hourlyRate);
	} //Different safety checks here, according to the prompt that "Salary employees are paid as if they worked 40 hours every week"

}

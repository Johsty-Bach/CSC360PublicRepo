package Payroll;

//Allows for quick and easy addition to pay types of employees
//Simply implement this interface with a new method of calculating weekly pay
interface PayModel {
	double getWeeklyPay(double hourlyRate, double weeklyHoursWorked);
}

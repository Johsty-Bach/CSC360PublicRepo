package Payroll;

public class Employee {
	//Data Fields
	String firstName;
	String lastName;
	double hourlyRate;
	double weeklyHoursWorked;
	PayModel paymentMethod; //Employee type is specified by the subclass of the specified PayModel
	
	//Constructors
	//Function to create employee with parameters
	public Employee(String firstName, String lastName, double hourlyRate, double weeklyHoursWorked, PayModel paymentMethod) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
		this.weeklyHoursWorked = weeklyHoursWorked;
		this.paymentMethod = paymentMethod;
	}
	
	//Default
	public Employee() {
		super();
		this.firstName = "N/A";
		this.lastName = "N/A";
		this.hourlyRate = 0;
		this.weeklyHoursWorked = 0;
		this.paymentMethod = null;
	}
	
	//Get and Set
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double getHoursWorked() {
		return weeklyHoursWorked;
	}
	//Function to set weekly hours worked
	public void setHoursWorked(double hoursWorked) {
		this.weeklyHoursWorked = hoursWorked;
	}
	
	// methods
	public double getWeeklyPay() {
		return this.paymentMethod.getWeeklyPay(this.hourlyRate, this.weeklyHoursWorked);
	}
}

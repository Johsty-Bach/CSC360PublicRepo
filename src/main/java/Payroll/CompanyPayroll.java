package Payroll;

import java.util.ArrayList;

public class CompanyPayroll {
	ArrayList<Employee> company_payroll;

	//Constructors
	public CompanyPayroll(ArrayList<Employee> company_payroll) {
		super();
		this.company_payroll = company_payroll;
	}

	public CompanyPayroll() {
		this.company_payroll = new ArrayList<Employee>();
	}
	
	//Add to array method
	public void addEmployee(Employee new_employee) {
		this.company_payroll.add(new_employee);
	}
	
	
	//Method to print calculate the pay of every employee
	//Iterates through each employee, calculates their weekly pay, and inserts into array
	public double[] calculatePay() {
		double[] payments = new double[this.company_payroll.size()];
		
		for (int i = 0; i < this.company_payroll.size(); i++) {
			payments[i] = this.company_payroll.get(i).getWeeklyPay();
		}
		
		return payments;
	}
}

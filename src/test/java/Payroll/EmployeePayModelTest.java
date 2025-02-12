package Payroll;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeePayModelTest {

	Employee conley;
	Employee horace;
	Employee big_sallie;		//Worked over 40 hours a week
	Employee lil_sal; 	//Worked under 40 hours a week
	CompanyPayroll payroll;
	
	@BeforeEach
	void setUp() throws Exception {
		//Setup individual employees
		conley = new Employee("Conley", "Contractor", 10, 50, new ContractorPayModel());
		horace = new Employee("Horace", "Hourly", 10, 50, new HourlyPayModel());
		big_sallie = new Employee("Sallie", "Salary", 10, 50, new SalaryPayModel());
		lil_sal = new Employee("Sal", "Salary", 10, 30, new SalaryPayModel());
		
		//Add to payroll
		payroll = new CompanyPayroll();
		payroll.addEmployee(conley);
		payroll.addEmployee(horace);
		payroll.addEmployee(big_sallie);
		payroll.addEmployee(lil_sal);
	}
	
	//Contractor pay test
	@Test
	void testGetWeeklyPayContractor() {
		assertEquals(500, conley.getWeeklyPay());
	}
	
	@Test
	void testGetWeeklyPayContractorSafety() {
		conley.setHoursWorked(-10);
		assertEquals(0, conley.getWeeklyPay());
		conley.setHourlyRate(-5);
		assertEquals(0, conley.getWeeklyPay());
	}
	
	//Hourly Pay Test
	@Test
	void testGetWeeklyPayHourly() {
		assertEquals(550, horace.getWeeklyPay());
	}
	
	@Test
	void testGetWeeklyPayHourlySafety() {
		horace.setHoursWorked(-10);
		assertEquals(0, horace.getWeeklyPay());
		horace.setHourlyRate(-5);
		assertEquals(0, horace.getWeeklyPay());
	}
	
	//Salary Pay Test -- Worked hours over 40
	@Test
	void testGetWeeklyPaySalaryOverage() {
		assertEquals(400, big_sallie.getWeeklyPay());
	}

	//Salary Pay Test -- Worked hours under 40
	@Test
	void testGetWeeklyPaySalaryUnderage() {
		assertEquals(400, lil_sal.getWeeklyPay());
	}
	
	@Test
	void testGetWeeklyPaySalarySafety() {
		big_sallie.setHoursWorked(-10);
		assertEquals(400, big_sallie.getWeeklyPay());
		big_sallie.setHourlyRate(-5);
		assertEquals(0, big_sallie.getWeeklyPay());
	} //Probably want to talk to the customer about this one...
	
	//Hours Entry test
	@Test
	void testSetHoursWorked() {
		assertEquals(50, conley.getHoursWorked());
		conley.setHoursWorked(30);
		assertEquals(30, conley.getHoursWorked());
	}
	
	//Pay Employees Test (generate an array of the payments to each employee)
	@Test
	void testCalculatePay() {
		assertEquals("[500.0, 550.0, 400.0, 400.0]", Arrays.toString(payroll.calculatePay()));
	}

}

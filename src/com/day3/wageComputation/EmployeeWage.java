package com.day3.wageComputation;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;

	int totalWorkingHrs = 0;
	int totalWorkingDays = 0;
	int empHrs = 0;
	int dailyWage;
	int totalWage;
	int empCheck;

	public void working() {
		totalWorkingHrs = totalWorkingHrs + empHrs;
		totalWorkingDays++;
		
		if ((totalWorkingHrs <= MAX_WORKING_HOURS) && (totalWorkingDays <= MAX_WORKING_DAYS)) {
			System.out.println("Randome Check is: " + empCheck);
			System.out.println("Full Time Employee");
			System.out.println("Total Working Hours = " + totalWorkingHrs);
			System.out.println("Day = " + totalWorkingDays);
		
			dailyWage = empHrs * EMP_RATE_PER_HR;
			System.out.println("Employee Daily Wage is: " + dailyWage);
			
			totalWage = totalWorkingHrs * EMP_RATE_PER_HR;
			System.out.println("Total Wage is: " + totalWage);
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		EmployeeWage emp = new EmployeeWage();
		while ((emp.totalWorkingHrs <= MAX_WORKING_HOURS) && (emp.totalWorkingDays <= MAX_WORKING_DAYS)) {

			emp.empCheck = (int) ((Math.random()) * 10) % 3;
			// obj1.empCheck=1;
			switch (emp.empCheck) {
			case IS_FULL_TIME:
				emp.empHrs = 8;
				emp.working();
				break;

			case IS_PART_TIME:
				emp.empHrs = 4;
				emp.working();
				break;

			default:
				emp.empHrs = 0;
				emp.working();
				break;

			}
		}
	}
}

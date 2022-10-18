package com.bridgeLabz;

public class EmployeeWage {
	static final int TOTAL_WORKING_HOURS = 100;
	static final int WORKING_DAYS_PER_M0NTH = 20;
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_TIME_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;

	public static void computeEmpWage(){
	int day = 1;
	int totalworkinghours = 0;
	int tatolwage = 0;
	while(day<=WORKING_DAYS_PER_M0NTH && totalworkinghours< TOTAL_WORKING_HOURS) {
		int dailywage = 0;
		int empcheck = (int)Math.floor(Math.random()*10)%3;
		
		switch (empcheck) {
		case IS_FULL_TIME:
			System.out.println("Employee Full Time");
			dailywage = WAGE_PER_HOUR * FULL_TIME_HOUR;
			totalworkinghours = totalworkinghours + FULL_TIME_HOUR;
			break;
		case IS_PART_TIME:
			System.out.println("Employee Part Time");
			dailywage = WAGE_PER_HOUR * PART_TIME_HOUR;
			totalworkinghours = totalworkinghours + PART_TIME_HOUR;

			break;
			
			
		default:	
			System.out.println("Employee is Absent");

		}
		tatolwage = tatolwage + dailywage;
		System.out.println("Daly Wage => " +dailywage);
		day++;
		}
	System.out.println("Total wage=>" +tatolwage);
	System.out.println("Total working hours=>" +totalworkinghours);
		
	}	
public static void main(String[] args) {
	System.out.println("welcome to Employee Wage");
	computeEmpWage();
}
}


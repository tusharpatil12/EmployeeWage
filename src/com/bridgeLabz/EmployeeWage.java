package com.bridgeLabz;

public class EmployeeWage {
	
	
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_TIME_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;



	public static void main(String[] args) {
		
		System.out.println("welcome to Employee Wage");
		
		int dailywage = 0;
		int empcheck = (int)Math.floor(Math.random()*10)%3;
		
		switch (empcheck) {
		case IS_FULL_TIME:
			System.out.println("Employee Full Time");
			dailywage = WAGE_PER_HOUR * FULL_TIME_HOUR;
			break;
		case IS_PART_TIME:
			System.out.println("Employee Part Time");
			dailywage = WAGE_PER_HOUR * PART_TIME_HOUR;
			break;
			
			
		default:	
			System.out.println("Employee is Absent");

		}
		
		System.out.println("Daly Wage => " +dailywage);
		
	}	
}


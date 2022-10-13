package com.bridgeLabz;

public class EmployeeWage {
	
	
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_TIME_HOUR = 8;

	public static void main(String[] args) {
		
		System.out.println("welcome to Employee Wage");
		
		int dailywage = 0;
		int empcheck = (int)Math.floor(Math.random()*10)%2;
		if(empcheck == 1) {	
			System.out.println("Employee is Present");
			dailywage = WAGE_PER_HOUR * FULL_TIME_HOUR;
		}
		else {
			System.out.println("Employee is Absent");
		}
		System.out.println("Daly Wage =>" +dailywage);

	}

}

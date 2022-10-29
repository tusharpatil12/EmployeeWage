package com.bridgeLabz;

public class EmployeeWage {
	
	static final int FULL_TIME_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;
	
	
	 private String COMPONY_NAME;
	   private final int TOTAL_WORKING_HOURS;
	   private final int WORKING_DAYS_PER_MONTH;
	   private final int WAGE_PER_HOUR;
	   private int total_wage;
	   
		public EmployeeWage(String COMPANY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS){
			this.COMPONY_NAME = COMPONY_NAME;
	        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
	        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
	        this.TOTAL_WORKING_HOURS = TOTAL_WORKING_HOURS;

		}
	public int computeEmpWage(){
		int day = 1;
		int totalworkinghours = 0;
		int tatolwage = 0;
		while(day <= WORKING_DAYS_PER_MONTH && totalworkinghours <= TOTAL_WORKING_HOURS) {
			int dailywage = 0;
			int empcheck = (int) Math.floor(Math.random()*10) % 3;

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
			System.out.println("Daly Wage => "+day+" =>"+dailywage);
			day++;
		}
		System.out.println("Total wage=>" +tatolwage);
		System.out.println("Total working hours=>" +totalworkinghours);
		return tatolwage;
		
	}
	
	@Override
	public String toString() {
		return "EmployeeWage{"+
	"COMPANY_NAME='" + COMPONY_NAME + '\'' +
	",total_wage=" + total_wage +
	'}';
		
	}
	
	public static void main(String[] args) {
		System.out.println("welcome to Employee Wage");
		 EmployeeWage dmart = new EmployeeWage("D-Mart",20,1,10);
         EmployeeWage nokia = new EmployeeWage("NOKIA",15,2,10);
         dmart.computeEmpWage();
        System.out.println(dmart);
        nokia.computeEmpWage();
        System.out.println(nokia);

	}
}


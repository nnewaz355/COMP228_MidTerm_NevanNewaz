package com.nn.midterm;

public abstract class MedicalStaff extends Person {
	
	private final String staffId; //decided by main method
	private String department;
	private double monthlySalary;
	protected static int staffCount;
	
	
	public MedicalStaff(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary) {
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getStaffId() {
		return staffId;
	}

	public static int getStaffCount() {
		return staffCount;
	}

	public abstract double calculateMonthlyCompensation();

	@Override
	public String getRoleDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
		System.out.println("Name: " + getName());
		System.out.println("Role: " + getRoleDescription());
		System.out.println("Department: " + department);
		System.out.println("Phone: " + getPhoneNumber());
		System.out.printf("Monthly Salary: $%.2f", monthlySalary);
	}

}

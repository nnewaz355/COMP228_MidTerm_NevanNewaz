package com.nn.midterm;

public abstract class MedicalStaff extends Person {
	
	private final String staffId;
	private String department;
	private double monthlySalary;
	
	
	public MedicalStaff(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary) {
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
	}
	
	public abstract double calculateMonthlyCompensation();

	@Override
	public String getRoleDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
		System.out.println("Name: " + name);
		System.out.println("Role: " + getRoleDescription());
		System.out.println("Department: " + department);
		System.out.println("Phone: " + getPhoneNumber());
		System.out.printf("Monthly Salary: $%.2f", monthlySalary);
	}

}

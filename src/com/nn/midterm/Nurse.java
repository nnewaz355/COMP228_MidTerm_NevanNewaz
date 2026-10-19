package com.nn.midterm;

public class Nurse extends MedicalStaff { // hybrid inheritance (multilevel and hierarchical)
	private final String shiftType;
	private final double shiftAllowance;
	
	public Nurse(String name, String phoneNumber, String staffId, String department,
			double monthlySalary, String shiftType, double shiftAllowance) {
		super(staffId, name, phoneNumber, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	@Override
	public double calculateMonthlyCompensation() {
		return getMonthlySalary() + shiftAllowance;
	}
	
	@Override
	public void displayStaffDetails(){
		super.displayStaffDetails();
		System.out.println("Department: " + this.getDepartment());
		System.out.println("Shift: " + this.shiftType);
		System.out.printf("Monthly Compensation: $%.2f", this.calculateMonthlyCompensation());
	}
	
	@Override
	public String getRoleDescription() {
		return "Nurse (" + shiftType + " shift)";
	}
}

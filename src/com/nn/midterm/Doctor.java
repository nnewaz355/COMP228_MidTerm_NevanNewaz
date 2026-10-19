package com.nn.midterm;

public class Doctor extends MedicalStaff { //multilevel inheritance
	
	private final double consultationFee;
	private int patientsSeen;
	
	
	public Doctor(String name, String phoneNumber, String staffId, String department, double monthlySalary,
			double consultationFee, int patientsSeen) {
		super(staffId, name, phoneNumber, department, monthlySalary);
		this.consultationFee = consultationFee;
		this.patientsSeen = patientsSeen;
	}

	@Override
	public double calculateMonthlyCompensation() {
		// TODO Auto-generated method stub
		return getMonthlySalary();
	}
	
	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("\nPatients Seen: " + patientsSeen);
		System.out.printf("Consultation Fee: $%.2f", calculateConsultationFee());
		System.out.println();
		System.out.printf("Monthly Compensation: $%.2f", calculateMonthlyCompensation());
	}
	
	public double calculateConsultationFee() {
		return consultationFee;
	}
	//discount is from 0 to 100, letting some values be such as 4.75%
	public double calculateConsultationFee(double discount) {
		if (discount < 0 || discount > 100) {
			throw new IllegalArgumentException("Discount must be between 0 and 100 percent.");
		}
		return calculateConsultationFee() * (100.00 - discount) / 100.00; //refuse integer division
	}

	public double calculateConsultationFee(double discount, double additionalCharge) {
		if (additionalCharge < 0) {
			throw new IllegalArgumentException("Additional Charge cannot be negative.");
		}
		return calculateConsultationFee(discount) + additionalCharge;
	}
	
	@Override
	public String getRoleDescription() {
		return "Doctor";
	}
}

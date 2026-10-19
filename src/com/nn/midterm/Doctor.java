package com.nn.midterm;

public class Doctor extends MedicalStaff {
	
	private final double consultationFee;
	private int patientsSeen;
	
	
	public Doctor(String name, String phoneNumber, String staffId, String department, double monthlySalary,
			double consultationFee, int patientsSeen) {
		super(name, phoneNumber, staffId, department, monthlySalary);
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
		System.out.println("Patients Seen: " + patientsSeen);
		System.out.printf("Consultation Fee: $%.2f", calculateConsultationFee());
		System.out.printf("Monthly Compensation: $%.2f", calculateMonthlyCompensation());
	}
	
	public double calculateConsultationFee() {
		return consultationFee;
	}
	//discount is from 0 to 100, letting some values be such as 4.75%
	public double calculateConsultationFee(double discount) {
		return calculateConsultationFee() * (100.00 - discount) / 100.00; //refuse integer division
	}

	public double calculateConsultationFee(double discount, double additionalCharge) {
		return calculateConsultationFee(discount) + additionalCharge;
	}
}

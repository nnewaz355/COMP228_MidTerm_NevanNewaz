package com.nn.midterm;

public class SpecialistDoctor extends Doctor {
	private final String specialization;
	private final double specialistSurcharge;
	
	
	
	public SpecialistDoctor(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary, double consultationFee, int patientsSeen, String specialization,
			double specialistSurcharge) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientsSeen);
		this.specialization = specialization;
		this.specialistSurcharge = specialistSurcharge;
	}

	@Override
	public double calculateConsultationFee() {
		return super.calculateConsultationFee() + specialistSurcharge;
	}
	
	@Override
	public void displayStaffDetails(){
		super.displayStaffDetails();
		System.out.println("Specialization: " + specialization);
		System.out.printf("Consultation Fee: $%.2f", calculateConsultationFee());
	}
	
	@Override
	public String getRoleDescription() {
		return "Specialist Doctor (" + specialization + ")";
	}
}

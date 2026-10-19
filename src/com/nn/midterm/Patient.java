package com.nn.midterm;

public class Patient extends Person {
	
	/*
	 *  final patientNumber, age, department, consultation fee, overloaded registerPatient()
methods, validation, and patient details.
	 */
	
	private final String patientNumber;
	private int age;
	private String medicalDepartment;
	private double consultationFee;
	protected static int patientCount = 0;
	
	public Patient(String personId, String name, String phoneNumber, String patientNumber, int age, String medicalDepartment,
			double consultationFee) {
		super(personId, name, phoneNumber);
		this.patientNumber = patientNumber;
		this.age = age;
		this.medicalDepartment = medicalDepartment;
		this.consultationFee = consultationFee;
		patientCount++;
	}// Because the register methods have parametric input, we will be using it to instantiate patients

	@Override
	public String getRoleDescription() {
		// TODO Auto-generated method stub
		return "Patient";
	}
	
	public void displayPatientDetails() {
		//System.out.printf("Patient Number: %s%nName: %s%nAge: %d%nDepartment: %s%nConsultation Fee: $%.2d", this.patientNumber, this.getName(), this.age, this.medicalDepartment, this.consultationFee);
		displayBasicDetails();
		System.out.println("Patient Number: " + this.patientNumber);
		System.out.println("Age: " + age);
		System.out.println("Department: " + this.medicalDepartment);
		System.out.printf("Consultation Fee: $%.2f" + this.consultationFee);
	}
	
	public void registerPatient(String name, int age, String department) { //Default Phone Number will be not provided
		if(age >= 0 && name.length() > 0 && department.length() > 0) { //register and count patient
			System.out.println("Registration Status: Successful");
			patientCount += 1;
		} else { //unsuccessful
			System.out.println("Registration Status: Failed");
		}
	}
	
	public void registerPatient(String name, int age, String department, String phoneNumber) {
		if(age >= 0 && name.length() > 0 && department.length() > 0 && phoneNumber.length() > 0) { //register and count patient
			System.out.println("Registration Status: Successful");
			patientCount += 1;
		} else { //unsuccessful
			System.out.println("Registration Status: Failed");
		}
	}
}

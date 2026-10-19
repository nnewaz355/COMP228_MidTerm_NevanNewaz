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
	}

	@Override
	public String getRoleDescription() {
		// TODO Auto-generated method stub
		return "Patient";
	}
	
	public void displayPatientDetails() {
		System.out.println("Patient Number: " + this.patientNumber + "\nName: " + this.name + "\nAge: " + this.age + "\nDepartment: " + this.medicalDepartment);
	}
	
	public void registerPatient(String name, int age) {
		if(age >= 0 && name.length() > 0) { //register and count patient
			System.out.println("Registration Status: Successful");
			patientCount += 1;
		} else { //unsuccessful
			System.out.println("Registration Status: Failed");
		}
	}
	
	public void registerPatient(String name, int age, String department) {
		if(age >= 0 && name.length() > 0 && department.length() > 0) { //register and count patient
			System.out.println("Registration Status: Successful");
			patientCount += 1;
		} else { //unsuccessful
			System.out.println("Registration Status: Failed");
		}
	}
}

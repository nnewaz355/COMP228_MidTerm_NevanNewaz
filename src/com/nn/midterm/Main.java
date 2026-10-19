package com.nn.midterm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========================================");
		System.out.println("          CAREPOINT HOSPITAL");
		System.out.println("          MANAGEMENT SYSTEM");
		System.out.println("========================================");
	
		System.out.println("REGISTRATION SUMMARY");
		System.out.println("Total People: " + Person.personCount);
		System.out.println("Total Patients: " + Patient.patientCount);
		System.out.println("Total Medical Staff: " + MedicalStaff.staffCount);
	}

}

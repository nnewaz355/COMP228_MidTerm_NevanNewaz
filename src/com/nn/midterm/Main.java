package com.nn.midterm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========================================");
		System.out.println("          CAREPOINT HOSPITAL");
		System.out.println("          MANAGEMENT SYSTEM");
		System.out.println("========================================");
		
		System.out.println("\nPATIENT REGISTRATION");
		Patient priya = Patient.registerPatient("Priya Sharma", 35, "Cardiology", "416-555-0102"); // 4 parameters
		System.out.println();
		Patient daniel = Patient.registerPatient("Daniel Brown", 42); // 2 parameters: default department
		System.out.println();
		Patient.registerPatient("", 28, "Dermatology"); // 3 parameters: empty name (rejected)
		System.out.println();
		Patient.registerPatient("Tom Lee", 150, "Orthopedics"); // 3 parameters: age is too high (rejected)
	
		System.out.println("\nREGISTRATION SUMMARY");
		System.out.println("Total People: " + Person.personCount);
		System.out.println("Total Patients: " + Patient.patientCount);
		System.out.println("Total Medical Staff: " + MedicalStaff.staffCount);
	}

}

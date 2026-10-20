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
		
		//Create Staff
		Doctor doctor = new Doctor("D2001", "Dr. Amit Kumar", "416-555-0110", "Cardiology",9000.00, 150.00, 100);
		SpecialistDoctor specialist = new SpecialistDoctor("D2002", "Dr. Neha Patel", "416-555-0111","Neurosciences", 12000.00, 150.00, 80, "Neurology", 50.00);
		Nurse nurse = new Nurse("N3001", "Sarah Wilson", "416-555-0112", "Emergency",5000.00, "Night", 500.00);
		
		//Display staff details separately
		System.out.println("\nDOCTOR DETAILS");
		doctor.displayStaffDetails();
		System.out.println("\n\nSPECIALIST DOCTOR DETAILS");
		specialist.displayStaffDetails();
		System.out.println("\n\nNURSE DETAILS");
		nurse.displayStaffDetails();
		
		//Calculate Consultation Fees with overloaded methods
		System.out.println("\n\nCONSULTATION FEE CALCULATIONS");
		System.out.printf("Standard Consultation Fee: $%.2f", doctor.calculateConsultationFee());
		System.out.println();
		System.out.printf("Consultation Fee After Discount: $%.2f", doctor.calculateConsultationFee(10));
		System.out.println();
		System.out.printf("Consultation Fee With Additional Charge: $%.2f", doctor.calculateConsultationFee(10,40));
		System.out.println();
		
		//Display staff details with runtime polymorphism
		System.out.println("\nSTAFF DETAILS (Runtime Polymorphism)");
		MedicalStaff staff1 = doctor;
		MedicalStaff staff2 = specialist;
		MedicalStaff staff3 = nurse;
		MedicalStaff[] staffMembers = { staff1, staff2, staff3 };
		for (int i = 0; i < staffMembers.length; i++) {
			staffMembers[i].displayStaffDetails();
			System.out.println();
		}
		
		//Demonstrate runtime polymorphism and calculate monthly compensation
		for (MedicalStaff member : staffMembers) {
			System.out.printf("%s (%s): $%.2f",member.getName(), member.getRoleDescription(), member.calculateMonthlyCompensation());
			System.out.println();
		}
		
		//Demonstrate interfaces
		System.out.println("\nREPORTS (Reportable)");
		Reportable[] reportables = { priya, daniel, doctor, specialist, nurse };
		for (Reportable reportable : reportables) {
			reportable.generateReport();
		}
		
		//Schedule appointments
		System.out.println("\nAPPOINTMENT SCHEDULING (Schedulable)");
		Schedulable doctorSchedule = doctor;
		Schedulable specialistSchedule = specialist;
		doctorSchedule.scheduleAppointment("2026-11-02 10:00"); // valid
		specialistSchedule.scheduleAppointment("2026-11-03 14:30"); // valid
		specialistSchedule.scheduleAppointment("03/11/2026"); // illegal format (rejected)
		specialistSchedule.scheduleAppointment("2026-02-30 09:00"); // impossible date

	
		System.out.println("\nREGISTRATION SUMMARY");
		System.out.println("Total People: " + Person.personCount);
		System.out.println("Total Patients: " + Patient.patientCount);
		System.out.println("Total Medical Staff: " + MedicalStaff.staffCount);
		
		System.out.println("========================================");
		System.out.println("            END OF REPORT");
		System.out.println("========================================");
	}

}

package com.nn.midterm;

public abstract class Person {
	/*
	 *  final personId, name, phoneNumber, static personCount, getPersonCount(),
displayBasicDetails(), abstract getRoleDescription(), and toString()
	 */
	
	private final String personId;
	private String name;
	private String phoneNumber;
	protected static int personCount = 0;
	
	public Person(String personId, String name, String phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount += 1;
	}

	public int getPersonCount() {
		return personCount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPersonId() {
		return personId;
	}

	public void displayBasicDetails(){
		//System.out.println("Person ID: "+ this.personId + "\nName: " + this.name +  "\nPhone Number: "+this.phoneNumber + "Role: " + this.getRoleDescription());
		System.out.printf("Person ID: %s%nName: %s%nPhone Number: %s%nRole: %s%n", this.personId, this.name, this.phoneNumber, this.getRoleDescription());
	}
	
	public abstract String getRoleDescription(); // will return "Patient", etc.

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

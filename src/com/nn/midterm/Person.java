package com.nn.midterm;

public abstract class Person {
	/*
	 *  final personId, name, phoneNumber, static personCount, getPersonCount(),
displayBasicDetails(), abstract getRoleDescription(), and toString()
	 */
	
	private final String personId;
	protected String name;
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
	
	public void displayBasicDetails(){
		System.out.println("Person ID: "+ this.personId + "\nName: " + this.name +  "\nPhone Number: "+this.phoneNumber + "Role: " + this.getRoleDescription());
	}
	
	public abstract String getRoleDescription(); // will return "Patient", etc.

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

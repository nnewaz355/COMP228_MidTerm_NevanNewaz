package com.nn.midterm;

public abstract class Person {
	/*
	 *  final personId, name, phoneNumber, static personCount, getPersonCount(),
displayBasicDetails(), abstract getRoleDescription(), and toString()
	 */
	
	private final int personId;
	private String name;
	private int phoneNumber;
	protected static int personCount = 0;
	
	public Person(int personId, String name, int phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount += 1;
	}

	public int getPersonCount() {
		return personCount;
	}
	
	public void displayBasicDetails(){
		
	}
	
	public abstract String getRoleDescription(); // will return "Patient", etc.

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

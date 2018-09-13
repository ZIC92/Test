package com.example.filter;

public class person {
	private String name;
	private String gender;
	private String maritalStatus;

	public person (String name, String gender, String maritalStatus){
		this.setName(name);
		this.setGender(gender);
		this.setMaritalStatus(maritalStatus);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}


}

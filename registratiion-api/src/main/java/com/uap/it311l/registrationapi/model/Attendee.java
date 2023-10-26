package com.uap.it311l.registrationapi.model;

public class Attendee {
	String attendeeId;
	String firstName;
	String middleName;
	String lastName;
	String course;
	int age;
	boolean surveyEligibilityTag;
	
	public String getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getsurveyEligibilityTag() {
		return surveyEligibilityTag;
	}
	public void setsurveyEligibilityTag(boolean surveyEligibilityTag) {
		this.surveyEligibilityTag = surveyEligibilityTag;
	}
}

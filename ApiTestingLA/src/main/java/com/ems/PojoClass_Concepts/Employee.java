package com.ems.PojoClass_Concepts;

import java.util.List;

public class Employee {
private String FirstName;
private String LastName;
private String Email;

public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public List getSkills() {
	return Skills;
}
public void setSkills(List skills) {
	Skills = skills;
}
private List Skills;

}

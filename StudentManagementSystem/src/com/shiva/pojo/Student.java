package com.shiva.pojo;

public class Student {
private Integer sno;
private String firstName;
private String lastName;
private String email;
public Integer getSno() {
	return sno;
}
public void setSno(Integer sno) {
	this.sno = sno;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student(Integer sno, String firstName, String lastName, String email) {
	super();
	this.sno = sno;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}


}

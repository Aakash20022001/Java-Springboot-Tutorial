package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
private int custid;
private String custname;
private String coursename;
@Autowired
private Technologies techdetails;
public Technologies getTechdetails() {
	return techdetails;
}
public void setTechdetails(Technologies techdetails) {
	this.techdetails = techdetails;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public void display() {
	System.out.println("Customer Object Returned Successfully");
	techdetails.tech();
	}
}

package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Student_Details")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="StudentId")
	private int studentid;
	
	@Column(name = "Student_emailId")
	private String email_id;
	
	@Column(name = "phone_No")
	private int phoneNo;
	
	@Column(name ="Name")
	private String name;
	
	@Column(name ="Class_No")
	private int classNo;
	
	@Column(name="address")
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address addres;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", email_id=" + email_id + ", phoneNo=" + phoneNo + ", name=" + name
				+ ", classNo=" + classNo + ", address=" + address + ", addres=" + addres + "]";
	}
	

	
}
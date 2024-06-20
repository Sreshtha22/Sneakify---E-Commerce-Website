package com.example.ecom.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String phno;
	private String email;
	private String password;
	private String sqstn;
	private String ans;
	public Customer() {
	}
	public Customer(int id, String name, String email, String phno, String password, String sqstn, String ans) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.password = password;
		this.sqstn = sqstn;
		this.ans = ans;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSqstn() {
		return sqstn;
	}
	public void setSqstn(String sqstn) {
		this.sqstn = sqstn;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", password=" + password + ", sqstn=" + sqstn + ", ans=" + ans + "]";
	}
	}
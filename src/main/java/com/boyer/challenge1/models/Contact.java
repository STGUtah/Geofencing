package com.boyer.challenge1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity		
public class Contact {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String email;
	private String firstName;
	private String lastName;
	private boolean inOffice;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public boolean isInOffice() {
		return inOffice;
	}
	public void setInOffice(boolean inOffice) {
		this.inOffice = inOffice;
	}
	
}
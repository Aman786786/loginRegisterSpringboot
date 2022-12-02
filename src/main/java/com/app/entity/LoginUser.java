package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Login_User_Table")
public class LoginUser {
	

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="emailId")
	private String email;
	
	@Column(name="userPassword")
	private String password;

	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginUser(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}

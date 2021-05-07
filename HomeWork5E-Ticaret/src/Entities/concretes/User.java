package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity{
	private String firstName;
	private String lastName;
	private String email;
	private int password;
	private boolean ver = false;
	private int id;
	
	public User(int id, String firstName, String lastName, String eposta, int password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = eposta;
		this.password = password;
		this.id = id;
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

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean isVer() {
		return ver;
	}

	public void setVer(boolean ver) {
		this.ver = ver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

package com.augelevenassignment;

public class Users extends Player {
	
	protected String gender = null;

	public Users(String name, String gender) {
		super(name);
		this.gender = gender;
	}

	public Users() {
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void numberIsValid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String choice() {
		String string = null;
		return string;
		
	}
	
	
}

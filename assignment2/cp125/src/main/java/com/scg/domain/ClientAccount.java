package com.scg.domain;

import com.scg.util.Name;

public final class ClientAccount  implements Account {

	private String name;
	private Name contact;
	
	public ClientAccount(final String name, final Name contact){		
		this.name = name;
		this.contact = contact;
	}
	
	public Name getContact(){
		return this.contact;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean isBillable(){
		return true;
	}
	
	public void setContact(Name contact){
		this.contact = contact;
	}
	
}

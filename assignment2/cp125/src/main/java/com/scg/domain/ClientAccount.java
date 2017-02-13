package com.scg.domain;

import com.scg.util.Name;
import com.scg.util.Address;

public final class ClientAccount  implements Account {

	private String name;
	private Name contact;
	private Address address;
	
	public ClientAccount(final String name, final Name contact, final Address address){		
		this.name = name;
		this.contact = contact;
		this.address = address;
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

package com.scg.domain;

import com.scg.util.Name;

public class Consultant {

	private final Name name;
	
	public Consultant(Name name){
		this.name = name;
	}
	
	@Override
	public final String toString(){
		return name.toString();
	}
	
	public final Name getName(){
		return this.name;
	}
	
}

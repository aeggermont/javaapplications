package com.scg.domain;

public enum NonBillableAccount  implements Account{

	SICK_LEAVE("Sick Leave"),
	VACATION("Vacation"),
	BUSINESS_DEVELOPMENT("Business Development");
	
	private final String accountName;

	private NonBillableAccount(final String name) {
	    this.accountName = name;
	}
	
	@Override
	public String getName(){
		return accountName;
	}
	
	@Override
	public boolean isBillable() {
	  return false;
	}
	
	@Override
	public String toString() {
	    return this.accountName;
	}
}

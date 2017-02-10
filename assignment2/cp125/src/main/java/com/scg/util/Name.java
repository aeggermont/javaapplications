package com.scg.util;

public class Name {
	
	private String firstName;
	private String lastName;
	private String middleName;
	
	private static final String NonFN = "NFN";
	private static final String NonLN = "NLN";
	private static final String NonMN = "NMN";
	
	public Name(){
		this.firstName = NonFN;
		this.lastName = NonLN;
		this.middleName = NonMN;
	}
	
	public Name(String lastName, String firstName){
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public Name(String lastName, String firstName, String middleName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getMiddleName(){
		return this.middleName;
	}
	
	void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	
	@Override
	public String toString(){
		
		final StringBuilder strOutput = new StringBuilder();
		
		strOutput.append(this.lastName);
		strOutput.append(", ");
		strOutput.append(this.firstName);
		strOutput.append(", ");
		strOutput.append(this.middleName);
		
		return strOutput.toString();
	}
	
	
	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	            + ((firstName == null) ? 0 : firstName.hashCode());
	    result = prime * result
	            + ((lastName == null) ? 0 : lastName.hashCode());
	    result = prime * result
	            + ((middleName == null) ? 0 : middleName.hashCode());
	    return result;
	}
	
	
	@Override
    public boolean equals(final Object obj) {
		
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;

	    final Name other = (Name) obj;
	    
	    if (firstName == null) {
	        if (other.firstName != null) {
	            return false;
	        }
	    } else if (!firstName.equals(other.firstName)) {
	        return false;
	    }

	    if (lastName == null) {
	        if (other.lastName != null) {
	            return false;
	        }
	    } else if (!lastName.equals(other.lastName)) {
	        return false;
	    }

	    if (middleName == null) {
	        if (other.middleName != null) {
	            return false;
	        }
	    } else if (!middleName.equals(other.middleName)) {
	        return false;
	    }
	        
	    return true;
	}
}

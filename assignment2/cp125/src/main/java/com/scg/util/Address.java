package com.scg.util;

public final class Address {
	
	private String streetNumber;
	private String city;
	private StateCode state;
	private String postalCode;
	
	private static final String NSN = "NSN";
	private static final String NCITY = "NCITY";
	private static final StateCode NONSTATE = null;
	private static final String NONPSTCODE = "NONPSTCODE";
	
	public Address(){
		this.streetNumber = NSN;
		this.city = NCITY;
		this.postalCode = NONPSTCODE;
		this.state = NONSTATE;
	}
	
	public Address(final String streetNumber, 
				   final String city,
				   final StateCode state,
				   final String postalCode ){
			
		this.streetNumber = streetNumber;
		this.city = city;
		this.postalCode = postalCode;
		this.state = state;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getStreetNumber(){
		return this.streetNumber;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public String getState(){
		return this.getState();
	}
	
	
	@Override
    public boolean equals(final Object object) {
		
	  if (this == object){ return true; }
	  
	  if (object == null){ return false; }
	  
	  if (getClass() != object.getClass()){ return false; }

      final Address otherAddress = (Address) object;  
      
      if (streetNumber == null){
    	  if (otherAddress.streetNumber != null){
    		  return false;
    	  }
      } else if (!streetNumber.equals(otherAddress.streetNumber)){
    	  return false;
      }
        	        
	    return true;
	}
		
	
}

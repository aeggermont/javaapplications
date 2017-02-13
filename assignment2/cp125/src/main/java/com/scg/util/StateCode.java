package com.scg.util;

/**
 * U. S. Postal state codes.
 */
public enum StateCode {

	AK("ALASKA", "AK"),
	AL("ALABAMA", "AL"),
	AR("ARKANSAS", "AR"),
	AS("AMERICAN SAMOA", "AS"),
	AZ("ARIZONA", "AZ"),
	CA("CALIFORNIA", "CA"),
	CO("COLORADO", "CO"),
	CT("CONNECTICUT", "CT"),
	DC("DISTRICT OF COLUMBIA", "DC"),
	DE("DELAWARE", "DE"),
	FL("FLORIDA", "FL"),
	FM("FEDERATED STATES OF MICRONESIA", "FM"),
	GA("GEORGIA", "GA"),
	GU("GUAM", "GU"),
	HI("HAWAII", "HI"),
	IA("IOWA", "IA"),
	ID("IDAHO", "ID"),
	IL("ILLINOIS", "IL"),
	IN("INDIANA", "IN"),
	KS("KANSAS", "KS"),
	KY("KENTUCKY", "KY"),
	LA("LOUISIANA", "LA"),
	MA("MASSACHUSETTS", "MA"),
	MD("MARYLAND", "MD"),
	ME("MAINE", "ME"),
	MH("MARSHALL ISLANDS", "MH"),
	MI("MICHIGAN", "MI"),
	MN("MINNESOTA", "MN"),
	MO("MISSOURI", "MO"),
	MP("NORTHERN MARIANA ISLANDS", "MP"),
	MS("MISSISSIPPI", "MS"),
	MT("MONTANA", "MT"),
	NC("NORTH CAROLINA", "NC"),
	ND("NORTH DAKOTA", "ND"),
	NE("NEBRASKA", "NE"),
	NH("NEW HAMPSHIRE", "NH"),
	NJ("NEW JERSEY", "NJ"),
	NM("NEW MEXICO", "NM"),
	NV("NEVADA", "NV"),
	NY("NEW YORK", "NY"),
	OH("OHIO", "OH"),
	OK("OKLAHOMA", "OK"),
	OR("OREGON", "OR"),
	PA("PENNSYLVANIA", "PA"),
	PR("PUERTO RICO", "PR"),
	PW("PALAU", "PW"),
	RI("RHODE ISLAND", "RI"),
	SC("SOUTH CAROLINA", "SC"),
	SD("SOUTH DAKOTA", "SD"),
	TN("TENNESSEE", "TN"),
	TX("TEXAS", "TX"),
	UT("UTAH", "UT"),
	VA("VIRGINIA", "VA"),
	VI("VIRGIN ISLANDS", "VI"),
	VT("VERMONT", "VT"),
	WA("WASHINGTON", "WA"),
	WI("WISCONSIN", "WI"),
	WV("WEST VIRGINIA", "WV"),
	WY("WYOMING", "WY");
	
	private String stateCode;
	private String state;
	
	private StateCode(String stateCode, String  state ){
		this.stateCode = stateCode;
		this.state = state;
	}

	
}

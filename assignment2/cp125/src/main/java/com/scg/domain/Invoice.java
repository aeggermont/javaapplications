package com.scg.domain;

import java.time.Month;

/*
 * Invoice encapsulates the attributes and behavior to create client invoices 
 * for a given time period from time cards.
 */

public class Invoice {
	
	private final ClientAccount client;
	private final Month invoiceMonth;
	private final int invoiceYear;

	public Invoice(ClientAccount client, Month invoiceMonth, int invoiceYear){
		this.client = client;
		this.invoiceMonth = invoiceMonth;
		this.invoiceYear = invoiceYear;
	}
	
	public ClientAccount getClientAccount(){
		return this.client;
	}
	
	public Month getInvoiceMonth(){
		return this.invoiceMonth;
	}
	
	

	
	
}

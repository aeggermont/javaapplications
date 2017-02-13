package com.scg.domain;

import java.util.Date;

public final class ConsultantTime {

	private Date date;
	private Account account;
	private Skill skillType;
	private int hours;
	
	public ConsultantTime (final Date date, 
						   final Account account, 
						   final Skill skillType, 
						   final int hours){
	
		this.date = new Date(date.getTime());
		this.account = account;
		this.skillType = skillType;
		setHours(hours);
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Account getAccount(){
		return this.account;
	}
	
	public void setAccount(Account account){
		this.account = account;
	}
	
	public boolean isBillable(){
		return this.account.isBillable();
	}
	
	public int getHours(){
		return this.hours;
	}
	
	public void setHours(final int hours){
		
		if ( hours <= 0){
			throw new IllegalArgumentException("Hours must greater than zero.");
		}else{
			this.hours = hours;
		}	
	}
	
	public Skill getSkill(){
		return this.skillType;
	}
	
	
    @Override
    public String toString() {
        return String.format("%-28s %2$tm/%2$td/%2$tY  %3$5d  %4$s%n",
                             account.getName(), date, hours, skillType);
    }
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + hours;
        result = prime * result + ((skillType == null) ? 0 : skillType.hashCode());
        return result;
    }
	
	
	
}

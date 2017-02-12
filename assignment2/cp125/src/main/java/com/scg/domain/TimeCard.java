package com.scg.domain;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Collections;
import java.util.Locale;
import java.util.Formatter;

public class TimeCard {

	private final Consultant consultant;
	private final Date startDayInWorkWeek;
	
	
	private int totalWeekBillableHours;
	private int totalWeekNonBillableHours;
	private final List<ConsultantTime> consultingHours;
    private int totalWeekWorkedHours;
	
	    
    /** Formatters **/
    private static final String TIME_CARD_SEPARATOR = "======================================================================%n";
    private static final String TIME_CARD_HEADER = "Consultant: %-31s Week Starting: %2$tb %2$td,%2$tY%n";
    
    
    private static final String LINE_HEADER_FORMAT = 
    		String.format("%-28s %-10s  %5s  %s%n"
                        + "---------------------------  ----------  -----  --------------------%n",
            "Account", "Date", "Hours", "Skill");
    
    private static final String BILLABLE_TIME_HEADER = 
    		String.format("%n %26s %10s %1s %n%n" , "----", "Billable Time" , "----");
    		
    private static final String NON_BILLABLE_TIME_HEADER = 
    		String.format("%n %26s %10s %1s %n%n" , "----", "Non-billable Time" , "----");
    		   
    
    private static final String LINE_FORMAT = "%-28s %2$tm/%2$td/%2$tY  %3$5d  %4$s%n";
    
    private static final String SUMMARY_LINE = "%-39s  %5d%n";
    
    private static final String SUMMARY_HEADER = "%n ---- Summary ----%n";

    private static final String TO_STRING_FORMAT = "%s, Week Starting: %2$tb %2$td,%2$tY%n";
        
    
	public TimeCard(Consultant consultant, Date weekStartingDay){
		this.consultant = consultant;
		this.startDayInWorkWeek =  new Date(weekStartingDay.getTime());
		this.totalWeekWorkedHours = 0;
		this.totalWeekBillableHours = 0;
		this.totalWeekNonBillableHours = 0;
		this.consultingHours = new ArrayList<ConsultantTime>();
		
	}
	
	public Consultant getConsultant(){
		return this.consultant;
	}
	
	
	public int getTotalBillableHours(){
		return this.totalWeekBillableHours;
	}
	
	public int getTotalNonBillableHours(){
		return this.totalWeekNonBillableHours;
	}
	
	public List<ConsultantTime> getConsultingHours() {
		return Collections.unmodifiableList(this.consultingHours);
	}
	
	
	public void addConsultantTime(ConsultantTime consultantTime){
		this.consultingHours.add(consultantTime);
		
		final int addedHours = consultantTime.getHours();
		
		if (consultantTime.isBillable()){
			this.totalWeekBillableHours += addedHours;
		}else{
			this.totalWeekNonBillableHours += addedHours;
		}
		this.totalWeekWorkedHours += addedHours;
	}

	public int getTotalHours() {
	    return this.totalWeekWorkedHours;
	}
	
    public Date getWeekStartingDay() {
	    return new Date(startDayInWorkWeek.getTime());
	}
	
	
	public  List<ConsultantTime> getBillableHoursForClient(final String clientName){
		final ArrayList<ConsultantTime> billableConsultingHours = new ArrayList<ConsultantTime>();
		
		for( final ConsultantTime currentTime : this.consultingHours){
			if (clientName.equals(currentTime.getAccount().getName())){
				if(currentTime.isBillable()){
					billableConsultingHours.add(currentTime);
				}
			}
		}
		
		return billableConsultingHours;
	}
	
	private void appendTime(final Formatter formatter, 
							final List<ConsultantTime> hours,
							final boolean billable) {
		
		for (final ConsultantTime currentTime : hours) {
			
			if (currentTime.isBillable() == billable) {
				
				formatter.format(LINE_FORMAT, 
							  currentTime.getAccount().getName(),
                              currentTime.getDate(),
                              currentTime.getHours(),
                              currentTime.getSkill());
			}
		}
	}
	
	@Override
	public String toString() {
	    return String.format(TO_STRING_FORMAT, this.consultant.getName(), startDayInWorkWeek);
	}
	
	
	public String toReportString() {
        final StringBuilder sb = new StringBuilder();
        final Formatter formatter = new Formatter(sb, Locale.US);
        // Put on a header.
        formatter.format(TIME_CARD_SEPARATOR)
                 .format(TIME_CARD_HEADER, consultant.getName(), startDayInWorkWeek)
                 .format(BILLABLE_TIME_HEADER)
                 .format(LINE_HEADER_FORMAT);

        appendTime(formatter, consultingHours, true);

        formatter.format(NON_BILLABLE_TIME_HEADER)
                 .format(LINE_HEADER_FORMAT);

        appendTime(formatter, consultingHours, false);

        formatter.format(SUMMARY_HEADER)
                 .format(SUMMARY_LINE, "Total Billable:", totalWeekBillableHours)
                 .format(SUMMARY_LINE, "Total Non-Billable:", totalWeekNonBillableHours)
                 .format(SUMMARY_LINE, "Total Hours:", totalWeekWorkedHours)
                 .format(TIME_CARD_SEPARATOR);

        final String s = formatter.toString();
        formatter.close();
        return s;
    }

	
	
}

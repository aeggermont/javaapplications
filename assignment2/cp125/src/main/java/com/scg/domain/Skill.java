package com.scg.domain;

public enum Skill {
    
    PROJECT_MANAGER("Project Manager", 250),
    SYSTEM_ARCHITECT("System Architect", 200),
    SOFTWARE_ENGINEER("Software Engineer", 150),
    SOFTWARE_TESTER("Software Tester", 100),
    UNKNOWN_SKILL("Unknown Skill", 0);
	
	private int rate;
	private String friendlyName;
	
	private Skill(final String name, final int rate){
		this.friendlyName = name;
		this.rate = rate;
	}

    public int getRate() {
        return this.rate;
    }
    
    @Override
  	public String toString() {
          return friendlyName;
    }
    
}

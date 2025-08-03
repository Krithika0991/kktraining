package com.oops.override;

public class GroupOne extends TeamHead {
	

public GroupOne(String clientName, int duration, String tlName) {
		super(clientName, duration, tlName);
	}

@Override
void showProjects() {
	System.out.println("level1");
}

String[] showTools() {
	 String[] stg =new String[]{"off","on"};
	 System.out.println("print the value" + stg);
	 return stg;
}
}

package com.oops.override;

public class GroupTwo extends TeamHead{

	public GroupTwo(String clientName, int duration, String tlName) {
		super(clientName, duration, tlName);
	}
	@Override
	void showProjects() {
		System.out.println("level2");
	}
	
void courseAssigned(String...courses) {
	for(String course:courses) {
		System.out.println(course);
	}
}
}

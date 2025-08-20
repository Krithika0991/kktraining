package com.oops.override;

public class TeamHead {
	String clientName;
	int duration;
	String tlName;

public TeamHead(String clientName, int duration, String tlName) {
		this.clientName = clientName;
		this.duration = duration;
		this.tlName = tlName;
	}

void showProjects() {
	System.out.println("check project CSE");
}
}

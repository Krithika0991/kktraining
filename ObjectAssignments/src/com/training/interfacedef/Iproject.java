package com.training.interfacedef;

public interface Iproject {
void doTask();
default String[] techStack() {
	 return new String[] {"java","c","c++"};
}
}

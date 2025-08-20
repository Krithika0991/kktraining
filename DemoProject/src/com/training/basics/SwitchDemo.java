package com.training.basics;

public class SwitchDemo {

	public static void main(String[] args) {
		int x = 10;

		int y = 20;
		String operatorchoice = "/";
		switch (operatorchoice) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;

		case "*":
			System.out.println(x * y);
			break;

		case "/":
			System.out.println(x / y);
			break;

		default:
			System.out.println("incorrectChoice");

		}
	}

}

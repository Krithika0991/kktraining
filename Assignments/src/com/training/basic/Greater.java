package com.training.basic;

//import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		int[] greaterArray = new int[4];
		greaterArray[0] = 102;
		greaterArray[1] = 140;
		greaterArray[2] = 196;
		greaterArray[3] = 111;
		for (int i = 0; i < greaterArray.length; i++) {
			int j = i + 1;
			if (i == greaterArray.length - 1) {
				j = i - 1;
			}
			if (greaterArray[i] > greaterArray[j]) {
				greaterArray[j] = greaterArray[i];
			}
		}
		System.out.println("Largest array :" + greaterArray[greaterArray.length - 1]);
	}

	// Scanner sc = new Scanner(System.in);

//sc.close();
}

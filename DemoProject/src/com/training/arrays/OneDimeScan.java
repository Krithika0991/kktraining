package com.training.arrays;

import java.util.Scanner;

public class OneDimeScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			num[i] =sc.nextInt();
		}
		for(int n:num) {
			System.out.println(n);
		}

	}

}

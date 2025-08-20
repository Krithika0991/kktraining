package com.training.arrays;

import java.util.Scanner;

public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][] marks =new int[3][2];
 Scanner sc = new Scanner(System.in);
 for(int i=0;i<marks.length;i++) {
	 for(int j=0;j<marks[i].length;j++)
		 marks[i][j]=sc.nextInt();
 }
 for(int[] val:marks) {
	 for(int value :val)
	 System.out.print(value);
 }
	}

}

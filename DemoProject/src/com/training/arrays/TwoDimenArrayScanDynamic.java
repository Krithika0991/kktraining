package com.training.arrays;

import java.util.Scanner;

public class TwoDimenArrayScanDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][] marks =new int[3][];
  marks[0] = new int[2];
  marks[1] = new int[3];
  marks[2] = new int[1]; //if uncomments it will not throw error since array default value it will take as zero
  
//  marks[0][0]= 10;
//  marks[0][1]=20;
//  marks[1][0]=30;
//  marks[1][1]=40;
//  marks[1][2]=50;

 Scanner sc = new Scanner(System.in);
 for(int i=0;i<marks.length;i++) {
	 for(int j=0;j<marks[i].length;j++)
		 marks[i][j]=sc.nextInt();
 }
 for(int[] val:marks) {
	 for(int value :val)
	 System.out.print(value);
 }
 System.out.println(" ");
 sc.close();
	}

}

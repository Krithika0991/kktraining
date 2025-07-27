package com.training.basic;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
  int[] greaterArray = new int[4];
  greaterArray[0] = 107;
  greaterArray[1] = 103;
  greaterArray[2] = 106;
  greaterArray[3] = 108;
  
for(int i=0;i<greaterArray.length;i++) {
	if(greaterArray[i]<greaterArray[i+1]) 
	{
		
System.out.println(greaterArray[i+1]);
		}
	}
}

 // Scanner sc = new Scanner(System.in);
  

  
//sc.close();
	}


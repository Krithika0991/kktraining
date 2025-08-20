package com.training.arrays;

public class OneDimensionArray {

	public static void main(String[] args) {
int[] nums = new int[4];
nums[0]= 1;
nums[1]=2;
nums[2]=3;
nums[3]=4;
//nums[4]=4;
System.out.println(nums[0]);
int sum=0;
for(int i=0;i<nums.length;i++)
{
	//sum =sum+nums[i];
	sum+=nums[i];
}
System.out.println(sum);
	}

}

package p02;

import java.util.Random;

public class Exam02 {
	public static void main(String[] org) {
		int[] nums = new int[5];
		int a=1;
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i]=r.nextInt(20+1);
			for(int j=1;j<20;j+=2) {
				if(nums[i]==j) {
					i--;
				}
			}
				
			
			
			System.out.println(nums[i]);
		}
	}
}

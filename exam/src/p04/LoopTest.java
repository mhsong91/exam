package p04;

import java.util.Scanner;

public class LoopTest {
	int num1,num2;
	void inputNums() {
		
	Scanner s = new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		int temp=0;
		if(num1>num2) {
			
			temp=num1;
			num1=num2;
			num2=temp;
		}
		
	}
	void func1() {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	void func2(int num1,int num2,int num3) {
		for(int i=num1;i<num2;i+=2) {
			if(i%num3==0) {
				System.out.println(i+",");
			}
			if(i%10==1) {
				System.out.println();
			}
		}
	 }	
	public static void main(String[] args) {
		LoopTest lt = new LoopTest();
		
//		int a =1,b=100;
//		System.out.println((a+b)*50);		
//		int i= 1;
//		
//		for(i=2;i<99;i+=2) {
//			System.out.println(i+",");
//					}
//		System.out.println(100);
//		for(i=1;i<99;i+=2) {
//			System.out.println(i+",");
//		}
		
//		System.out.println(99);
		lt.inputNums();
		lt.func1();
	    lt.func2(100,1,7);
//	    lt.func3();
	
	}
	}

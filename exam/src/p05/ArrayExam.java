package p05;

import java.util.Scanner;

public class ArrayExam {
	
	int num1;
	int num2;
	int [][] numArr;
	
	void inputNums() {
		Scanner Scanner;
	Scanner=new Scanner(System.in);
	num1=Scanner.nextInt();
	num2=Scanner.nextInt();
	int [][] numArr =new int [num1][num2];
	System.out.println(numArr.length);
	System.out.println(numArr[0].length);
	}
	void initNumArr() {
	numArr=new int[num1][num2];
	for(int i=0;i<numArr.length;i++) {
	for(int j=0;j<numArr[0].length;j++) {
	numArr[i][j]=j+1+(i*numArr.length);
	}
					}
				}
	void printNumArr(){
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[0].length;j++) {
				System.out.print(numArr[i][j]);
				if(j==numArr[0].length-1) {
					System.out.println();	
				}
				else if(j!=numArr[0].length-1) {
					System.out.print(",");
				}
				
				
				}
		
	}
	
//	
//	void inputNums() {
//		Scanner s = new Scanner(System.in);
//		num1=s.nextInt();
//		num2=s.nextInt();
//	}
	}
	public static void main(String[] args) {
//		ArrayExam ae = new ArrayExam();
//		ae.inputNums();
		//		numArr[0][0]=1;
//		numArr[0][1]=2;
//		numArr[0][2]=3;
//		
//		numArr[1][0]=1;
//		numArr[1][1]=2;
//		numArr[1][2]=3;
		
//		
//		numArr[2][0]=1;
//		numArr[2][1]=2;
//		numArr[2][2]=3;
		 ArrayExam ae =new ArrayExam();
		ae.inputNums();
		System.out.println(ae.num1);
		System.out.println(ae.num2);
		ae.initNumArr();
		ae.printNumArr();
			
		
//		
//		for(int i=0;i<3;i++) {
//			System.out.print(numArr[i][0]+",");
//			System.out.print(numArr[i][1]+",");
//			System.out.println(numArr[i][2]);
//		}
		
				
		}
	
	

}
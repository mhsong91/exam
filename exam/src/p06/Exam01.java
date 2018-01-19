package p06;

import java.util.Scanner;

public class Exam01 {
	int num1;
	int num2;

	void inputNums() {
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
	}

	void initNumArr() {
		for (int i = num1; i > 0; i--) {
			for (int j = num2; j > 0; j--) {
				String str = i + "x" + j + "=" + i * j + ",";
				if (i * j % 3 == 0) {
					str = "3의배수";
				}
				if(j==1) {System.out.print(i + "x" + j + "=" + i * j );
				
			}
				System.out.print(str);	
		}
			System.out.println(" ");
	}
	}
	
	

	public static void main(String[] args) {
		Exam01 e= new Exam01();
		e.inputNums();
		e.initNumArr();
		
//		for (int i = 9; i > 0; i--) {
//
//			for (int j= 9; j > 0; j--) {
//				String str = i + "x" + j + "=" + (i * j+",");
//				if (i * j % 3 == 0) {
//					str = "3의배수";
//							}
//				System.out.print(str);
//				
//				if (j!= 1) {
//					System.out.print(",");
//				}
//				System.out.println("");
//			}
//		}
	}
}

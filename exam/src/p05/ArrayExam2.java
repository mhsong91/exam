package p05;

import java.util.Scanner;

public class ArrayExam2 {
	int num1;
	int num2;

	void inputNums() {
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
	}

	void initNumArr() {
		for (int i = 1; i <= num1; i++) {

			for (int j = 1; j <= num2; j++) {
				if (j == num2) {
					System.out.print(i + "x" + j + "=" + i * j);
					System.out.println();
				} 
				else {
					System.out.print(i + "x" + j + "=" + i * j + ",");
				}
				

			}
		}
	}

	public static void main(String[] args) {
		
		ArrayExam2 ae = new ArrayExam2();
		ae.inputNums();
		ae.initNumArr();

	}
}

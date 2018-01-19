package p03;

import java.util.Scanner;

public class ObjectExam01 {
	int num1;
	int num2;
	
	public ObjectExam01(){
		System.out.println("생성자 호출");
	}
	public void add(int num1,int num2) {
		System.out.println("둘의합은"+(num1+num2));
	}
	int getNum2(int num2) {
		return num2;
	}
	public void inputnums() {
		Scanner sc= new Scanner (System.in);
		System.out.println("첫번째수를 입력해주세요");
		num1 = sc.nextInt();
		System.out.println("두번째수를 입력해주세요");
		num2 = sc.nextInt();
	}
	public static void main(String[] args) {
		ObjectExam01 OE = new ObjectExam01();
//		OE.inputNums();
//		OE.printLoop();
	}
}

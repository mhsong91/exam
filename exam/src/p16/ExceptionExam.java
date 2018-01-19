package p16;

import java.util.Scanner;

public class ExceptionExam {
	
	public void converAndPrint(String numstr)throws Exception {
//		try {
			System.out.println(Integer.parseInt(numstr)+1);
//		}catch(Exception i) {
//			System.out.println("숫자를 적어주시요");
//		}
//		
	}
	
	
	public static void main(String[] args) {
		ExceptionExam ee =new ExceptionExam();
		System.out.println("출력할 숫자를 입력해주세요");
		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
		try {
			ee.converAndPrint(str);
		} catch (Exception e) {
						
			System.out.println("숫자 입력해");
			System.out.println("출력할 숫자를 입력해주세요");
			str =s.nextLine();
		
		try {
			ee.converAndPrint(str);
		}catch (Exception e1) {
			System.out.println("숫자 입력해");
		}
		}
	}
}

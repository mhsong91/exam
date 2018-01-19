package p05;

import java.util.Scanner;

public class TotalExame {
	int a;
	Integer ac;
	boolean b;
	Boolean bc;
	
	public static void main(String[] args) {
		TotalExame te=new TotalExame();
		
		if(te.a==1||te.a==2||te.a==3) {
			System.out.println("a가 0아니에여");
		}
		else if(te.a ==0 && te.a==1) {
			System.out.println("a가0이아니에요");
	}
		String numStr="백육십칠";
		
		System.out.println(Integer.parseInt("167")==167);
		int a=0;
		double b=0.0;
		System.out.println(Double.parseDouble(Double.toString(b)));
		System.out.println("스트링으로 방갯수를 입력해주세요");
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();
		String[] strArr= new String[length];
		
		for(int i=0;i<strArr.length;i++){
			System.out.println((i+1)+"첫번째 방값을 입력해주세요");
			strArr[i]=s.nextInt()+"";
		}
		int sum=0;
		for(int i=0;i<strArr.length;i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		System.out.println(sum);
//		String[] strArr= new String[3];
//		strArr[0]="123";
//		strArr[1]="123";
//		strArr[2]="123";
////		System.out.println(strArr.length);
		
//		System.out.println(strArr[0].length());
//		System.out.println(strArr[0].equals("123".trim()));
	}
}

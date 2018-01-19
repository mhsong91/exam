package p07;

import java.util.Scanner;

public class Exam02 {
	
	
	public static void main(String[] args) {
		int a =167;
		int b = 5;
		int c =3;
		int d =2;
		int num=0;
		System.out.print("5배수");
		System.out.println(a/b);
		System.out.print("3의배수");
		System.out.println((a%b)/c);
		System.out.print("2의배수");
		System.out.println(((a%b)%c)/d);
		System.out.print("총물통의수");
		System.out.print((((a%b)%c)/d)+(a/b));
		
		for(int i=1;i<=a/b;i++) {
			num++;
		}
		for(int j=1;j<=a%b/c;j++) {
			num++;
		}
		System.out.print(num);
		
	}
}

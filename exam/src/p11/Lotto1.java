package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto1 {
	int a;
	int b;
	int[] c=new int[a];
	int[] d=new int[b];
	void inputnum() {
		Scanner s =new Scanner(System.in);
		System.out.println("참여자수");
		a=s.nextInt();
		System.out.println("당첨자수");
		b=s.nextInt();
	
	}
	void lotto1() {
		Random r = new Random();
		for(int i=0;i<c.length;i++) {
			r.nextInt((a)*2);
			for(int j=0;j<d.length;j++) {
			
			}
		}
	}
//	boolean isDupl() {
		
//	}
	void print() {
		
	}
	
	
	public static void main(String[] args) {
		Lotto1 l =new Lotto1();
		l.inputnum();
		
	}
	
}

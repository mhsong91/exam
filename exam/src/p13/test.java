package p13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
	
	ArrayList<Integer> al =new ArrayList<Integer>();
	int a;
	int b;
	void inputnum() {
		Scanner s =new Scanner(System.in);
		System.out.println("방갯수를 입력하세요");
		a= s.nextInt();
		

		
		
		for(int i =0;i<a;i++) {
			Random r = new Random();
			b=r.nextInt(a*2);
			if(al.indexOf(b)==-1) {
				
				i--;
			}
			al.add(b);	
		
		}
		
		System.out.println(al);
	}
	
	
	public static void main(String[] args) {
		
		test t =new test();
		t.inputnum();
		
	}
}

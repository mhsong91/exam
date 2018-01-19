package p200;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class random {

	
	
		ArrayList<Integer> al;
		ArrayList<Integer> al2;
		int a;
		int b;
	void input() {
		al2=new ArrayList<Integer>();
		al=new ArrayList<Integer>();
		Scanner s= new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째숫자를 입력하세요");
			b=s.nextInt();
			al2.add(b);
		}
		Random r= new Random();
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				
			}
			a=r.nextInt(45+1);
			al.add(a);
		}
		
		}
	
	
	
	
	void print(){
		System.out.println("이번주 당첨 숫자");
		for(Integer as:al) {
			System.out.print(as);
		}
		System.out.println("내가입력한숫자");
		for(Integer ad:al2) {
			System.out.print(ad);
		}
	}
	
	
	public static void main(String[] args) {
		random r=new random();
		r.input();
		r.print();
	}
}

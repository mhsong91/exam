package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	int a;
	int b;
	ArrayList<Integer> al = new ArrayList<Integer>();
	void inputnums() {
		
	Scanner s = new Scanner(System.in);
	System.out.println("최소값입력");
	a=s.nextInt();
	System.out.println("최대값 입력");
	b=s.nextInt();
	}
	void rnums() {
		Random r = new Random();
		for(int i=a;i<b;i++) {
		 int n=r.nextInt(b)+1;
		 al.add(n);
		}
	}
	void print() {
		for(Integer i:al) {
		System.out.print(i+",");
	}
	}
	public static void main(String[] args) {
	Test t =new Test();
	t.inputnums();
	t.rnums();	
	t.print();
	}
}

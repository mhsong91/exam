package p16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Loto {

	ArrayList<String> al;
	ArrayList<Integer> al2;
	String str;
	Integer a;

	Loto() {
		al = new ArrayList<String>();
		al2 = new ArrayList<Integer>();
	}
	boolean is(ArrayList<Integer> al2,Integer a) {
		for(int i=0;i<al2.size();i++) {
			if (al2.get(i)==a) {
				return true;
			}	
		}
		return false;
	}

	void input() {
		Scanner s= new Scanner(System.in);
		Random r= new Random();
		
		for(int i=0; i<2; i++) {
		a=r.nextInt(45)+1;
		if(is(al2,a)) {
			i--;
		}else {System.out.println("입력");
			str=s.nextLine();
			
			al.add(str);
			al2.add(a);
		}
	}
	}

	void print() {
		System.out.println(al);

		System.out.println(al2);
	}

	public static void main(String[] args) {
		Loto lo = new Loto();
		lo.input();
		lo.print();
	}
}

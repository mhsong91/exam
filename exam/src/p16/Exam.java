package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

	ArrayList<String> al;
	ArrayList<Integer> al2;
	Exam(){
	al =new ArrayList<String>();
	al2 =new ArrayList<Integer>();
	}
	void inputnums() {
		Scanner s =new Scanner(System.in);
		String str;
		Integer a;
		for(int i=0;i<2;i++) {
			System.out.println("이름을 입력하세요");
		str=s.nextLine();
		al.add(str);
		System.out.println("점수를 입력해주세요");
		a=Integer.parseInt(s.nextLine());
		al2.add(a);
		for(int j=i+1;j<al.size();j++) {
			if(al2.get(i)>al2.get(j)) {
				Integer tmp=al2.get(j);
				Integer tmpp = al2.get(i);
				al2.set(i, tmp);
				al2.set(j,tmpp);
			}	
		}
		}
				
	}
	void print(){
		for(String l:al) {
			System.out.println(l);	
		}
		System.out.println(al);
		System.out.println(al2);
	}
	
	public static void main(String[] args) {
		Exam e=new Exam();
		e.inputnums();
		e.print();
		
		
}
}
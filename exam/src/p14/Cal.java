package p14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Cal {

	int num;
	static int a;
	static int b;
	static String str;
//	void inputnum() {
//		System.out.println("a,b 입력");
//		Scanner s =new Scanner(System.in);
//		a=s.nextInt();
//		b=s.nextInt();
//		System.out.println("연산자 입력");
//		String str;
//		str=s.nextLine().trim();
//		if(str.equals("+")){
//			num= a+b;			
//		} else if(str.equals("-")){
//			num=a-b;
//		}else if(str.equals("*")){
//			num=a*b;
//		}else if(str.equals("/")){
//			num=a/b;
//		}
//		System.out.println(num);
//	}
//	int plus(str.equals("+")) {
//		return a+b;
//	}
//	int ma(str.equals("-") {
//		return a-b;
//	}
//	int gop(str.equals("*") {
//		return a*b;
//	}
//	int na(str.equals("/") {
//		return a/b;
//	}
//	
	
	public static void main(String[] args) {
	Cal c= new Cal();
	ArrayList<Integer> al =new ArrayList<Integer>();
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	al.add(a+b);
	al.add(a-b);
	al.add(a*b);
	al.add(a/b);
	
	for(int i=1;i<al.size();i++) {
		for(int j=i+1;j<al.size();j++) {
			if(al.get(i)>al.get(j)) {
				int p=al.get(i);
				int l =al.get(j);
				al.set(i,l);
				al.set(j,p);
			}
		}
	}
	System.out.println(al);	
		
//		c.inputnum();
		
		
	}
}

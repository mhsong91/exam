package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alstr= new  ArrayList<String>();
	
	void inputStr() {
		Scanner s =new Scanner(System.in);
		System.out.println("숫자를 너어");
		String str =s.nextLine();
		String[] strs =str.split(",");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
//		str="13,28,34,54,";
//		
//		String[] strs =str.split(",");
////		alstr.add(str[,]);
//		for(String ss:strs) {
//	
//			System.out.println(ss);
//		}
	}
	
	void add(String str) {
//		alstr.add(str);
		if(alstr.size()==0) {
			System.out.println("처음 추가했네");
			}
		else {
				System.out.println(alstr.get(alstr.size()-1));
			}
		alstr.add(str);
	}
	
	String get (int idx) {
		return alstr.get(idx);
	}
	void remove(int idx) {
		alstr.remove(idx);
	}
	void print() {
		for(int i=0;i<alstr.size();i++) {
			if(Integer.parseInt(alstr.get(i))%2==0) {
				remove(i);
				i--;
			}else {
				System.out.println(alstr.get(i)+","+i);
			}
//			if(i%2==0) {
//				alstr.remove(i);
//			}
//		System.out.println(alstr.get(i)+","+i);
		}

	}
	void printAlstr2() {
		int sum=0;
		for(int i=0;i<alstr.size();i++) {
			String numStr = alstr.get(i);
			int num =Integer.parseInt(numStr);
			sum+= num;
			System.out.println(i+","+numStr);
			
		}
		System.out.println(sum);
	}
	
}


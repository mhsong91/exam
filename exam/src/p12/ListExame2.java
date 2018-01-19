package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExame2 {
	ArrayList<String> al= new  ArrayList<String>();
	
	void inputnums() {
		Scanner s= new Scanner(System.in);
		System.out.println("숫자 , 입력");
		String str =s.nextLine();
		String[] strs = str.split(",");
		
		for(int i=0;i<strs.length;i++) {
			for(int j=1;j<strs.length;j++)
			if(strs[i]==strs[j]) {
				
				System.out.print("중복입니다");
//				System.out.println(strs[i]);
			}else {
				al.add(strs[i]);
				
			}
		}
	}
	void printal() {
		for(int i=0;i<al.size();i++) {
			String num = al.get(i);
			int a =Integer.parseInt(num);
			
			System.out.print(i+","+num);
		}
	}
	void print1() {
//		String num = al.get(i);
//		int a =Integer.parseInt(num);
		for(int i=0;i<al.size();i++) {
			String num = al.get(i);
			int a =Integer.parseInt(num);
			if(Integer.parseInt(al.get(i))%2==0) {
				i--;
			}
		else{
			System.out.print(i+","+num);
		}
	}
	}
	
	public static void main(String[] args) {
		ListExame2 le =new ListExame2();
		le.inputnums();
		le.printal();
		
	}
}

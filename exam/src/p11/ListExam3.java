package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListExam3 {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();	
	int a;
	
	Scanner s =new Scanner(System.in);
	System.out.print("랜덤갯수를 입력하세요");
	a=s.nextInt();
	
		Random r =new Random();
		for(int i=0;i<a;i++) {
			al.add(r.nextInt(100)+1);
		}
		Integer cnt=0;
		for(Integer i: al) {
			System.out.print(i+",");
			cnt+=i;
			
			
		}
		System.out.print(cnt);
		
	}
	

}

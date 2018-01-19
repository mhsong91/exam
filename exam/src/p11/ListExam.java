package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			Random r =new Random();
			al.add(r.nextInt(10)+1);
		
		int n =r.nextInt(10)+1;
		al.add(n);
		System.out.println(al.indexOf(n));
		if(al.indexOf(n)==-1) {
			al.add(n);
		}else {
			i--;
		}
		}
		
		for(Integer i:al) {
			System.out.println(i);	
		}
		
		
		
	}
}

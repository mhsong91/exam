package p14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Exam {
//	int num =30;
	public HashMap<Integer,ArrayList<Integer>> getAl(int num){
		ArrayList<Integer> al 
		=new ArrayList<Integer>();
		for(int i=1;i<=num;i++){
			if(num % i==0) {
				al.add(i);
			}	
		}
		HashMap<Integer,ArrayList<Integer>> hm = new 
		HashMap<Integer,ArrayList<Integer>>();
		hm.put(num,al);
		return hm;
	}
	public static void main(String[] args) {
		int num= 30;
//		ArrayList<Integer> al =new ArrayList<Integer>();
//		for(int i=0;i<num;i++){
//			if(num % i==0) {
//				al.add(i);
//			}	
//		}
		Exam e =new Exam();
//		HashMap<Integer,ArrayList<Integer>> hm
//		=new HashMap<Integer, ArrayList<Integer>>();
//		al.add(num);
//		hm.put(num, al);
		HashMap<Integer,ArrayList<Integer>>
		hm =new HashMap<Integer,ArrayList<Integer>>();
		Random r =new Random();
		for(int i=0;i<5;i++) {
			int n =r.nextInt((51)+50);
			hm.putAll(e.getAl(n));
		}
//		System.out.println(hm);
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(hm.get(key));
			System.out.println(hm.get(key).size());
		}
		
	}
}

package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {
	public static void main(String[] args) {
		MapExam me= new MapExam();
		
//		me.put("name","aaa");
//		me.put("name","bbb");
//		System.out.println(me.get("name"));
//		System.out.println(me.size());
		ArrayList<MapExam> al =new ArrayList<MapExam>();
	for(int i=0; i<10;i++) {
		me= new MapExam();
		Random r = new Random();
		int age = r.nextInt((100)+1);
		me.put("name","r"+i);
		me.put("age",""+age);
		al.add(me);
		//me.put("age)
		//random 1-100
		//AraayList 추가
//		System.out.println(me);
	}	
	for(MapExam m:al) {
//		System.out.print("name:"+m.get("name"));
//		System.out.println("age:"+m.get("age"));
		System.out.println(m);
	}

}}
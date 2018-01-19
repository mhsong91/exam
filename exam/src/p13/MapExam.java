package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {
	
	public static void main(String[] args) {
	HashMap<String,String> hm =new HashMap<String,String>();
	hm.put("age",10+"dd");
	hm.put("name","홍길동");
			ArrayList<HashMap<String,String>> al=
			new ArrayList<HashMap<String,String>>();
	
			
	for(int i=0; i<10; i++) {
		hm =new HashMap<String,String>();
		int a; 
		int tmp;
		int tmpp;
		Random r= new Random();
		a=r.nextInt(101);
		hm.put("age",i+a+"");
		hm.put("name",a+"홍길동");
		
		al.add(hm);
	}
//	for()
	
	
		for (HashMap<String,String> h:al) {
			System.out.println(h);
		}
	}
}

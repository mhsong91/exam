package p11;

import java.util.ArrayList;
import java.util.HashMap;


public class MapExam {
	
	public static void set(HashMap<String,String> hm) {
		hm.put("name","면훈");
		hm.put("names","송명");
//		hm = new HashMap<String,String>();
		
	}
	
	public static void main(String[] args) {
		HashMap<String,String> hm =new HashMap<String,String>();
		hm.put("name","송명훈");
		hm.put("name","명훈");
		hm.put("names","송명훈");
		hm = new HashMap<String,String>();
		System.out.println(hm.get("name"));
		System.out.println(hm.get("names"));
		ArrayList<HashMap<String,String>>
		alMap =new 	ArrayList<HashMap<String,String>>();
		alMap.add(hm);
		hm.put("name","명훈이");
		System.out.println(alMap.get(0).get("name"));
	}
}

package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExame {
	LinkedHashMap<Integer,String> hm =new LinkedHashMap<Integer,String>();
	
	void add(String str) {
		hm.put(hm.size(),str);
//		System.out.println(hm.size());
	}
	void add(int idx, String str) {
		hm.put(idx,str);

		
//		System.out.println(hm.size());
	}
	
	public static void main(String[] args) {
		MapExame me=new MapExame();
		Random r =new Random();
		for(int i=0;i<10;i++) {
			if(i==r.nextInt(10)) {
				i--;
			}
//			if(me.hm.get(n)==null) {
//				me.add(n);
//			}else {i--;
//			}
//			}
			me.add(r.nextInt(10)+".");
			
		}
	
//		me.add("sfsdf");
//		me.add("sfsdf");
//		me.add("sfsdf");
//		me.add("sfsdf");
		System.out.println(me.hm);
	}
}

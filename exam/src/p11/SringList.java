package p11;

import java.util.ArrayList;

public class SringList {
	
	ArrayList<String> alStr;
	SringList(){
		alStr = new ArrayList<String>();
	}
	public void initAlStr() {
		for(int i=0;i<10;i++) {
			alStr.add(i+"");
		}
	}
	public void printAlStr() {
		for(int i=0;i<10;i++) {
			System.out.print(alStr.get(i)+",");
		}
	}
	
	public static void main(String[] args) {
		SringList sl =new SringList();
//		int len =sl.alStr.size();
//		System.out.println(len);
//		sl.alStr.add("123");
//		len =sl.alStr.size();
//		System.out.println(len);
//		System.out.println(sl.alStr.size());
		sl.initAlStr();
		sl.printAlStr();
		System.out.println();
		System.out.println(sl.alStr);
//		
	}
}

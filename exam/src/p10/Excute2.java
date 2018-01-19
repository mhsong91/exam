package p10;

import java.util.Objects;

public class Excute2 {
	public static void main(String[] args) {
		Object p1= new Person();
		Object p2 =new P2();
		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
		Object[] ob = new Object[3];
		ob[0]=p2;
		ob[1]=new P3();
		ob[2]=new P4();
		
//		Excute2 ex= new Excute2();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
	
	for(Object o:ob){
		System.out.println(o);
	}
	}	
}

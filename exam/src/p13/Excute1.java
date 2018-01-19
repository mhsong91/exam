package p13;

import java.util.ArrayList;
import java.util.Set;

public class Excute1 {
	public static void main(String[] args) {
		Person1 p =new Person1();
//		System.out.println(p.name);
//		System.out.println(p.age);
//		p.setName("smh");
//		p.setAge(27);
		ArrayList<Person1> alp =new ArrayList<Person1>();
		alp.add(p);
//		p.name ="111";
		p= new Person1();
		p.setName("ppp");
		p.setAge(55);
//		alp.add(p);
		p.setName("sss");
		p.setAge(26);
//		alp.add(p);
		p.setName("kkk");
		p.setAge(22);
//		for(int i =0;i<alp.size();i++) {
//		 for(int j=i+1;j<alp.size();j++) {
//			 
//			 if(alp.get(i).getAge()>alp.get(j).getAge()) {
////				 System.out.println(alp);
//			 }else {int tmp=0;
//				int tmpp=0;
//				 tmp=alp.get(i).getAge();
//				 tmpp=alp.get(j).getAge();
//				 alp.get(i).setAge(tmpp);
//				 alp.get(j).setAge(tmp);
////				 System.out.print(alp);
//			 }
//			 
////			 System.out.print(alp);
//		 }
//		}
//		alp.add(p);
		for(int i=0;i<alp.size();i++) {
			Person1 pr = alp.get(i);
			for(int j =i+1;j<alp.size();j++) {
				Person1 pr2 = alp.get(j);
				if(pr.getAge()<pr2.getAge()){
					Person1 tmp =pr;
					pr = pr2;
					pr2 =tmp;
					alp.set(i, pr);
					alp.set(j, pr2);
				}
			}
		}
		
		
		for(Person1 pr:alp) {
			System.out.println(pr);
		}
	}

}

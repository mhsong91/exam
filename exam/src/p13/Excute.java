package p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	ArrayList<Person> alPerson;
	Excute(){
		alPerson =new ArrayList<Person>();	
	}
	void inputPersonCount() {
		System.out.println("사람수 입력");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+"번째 학생을 이렵해주세요");
			String name =s.nextLine();
			Student st =new Student(name);
			System.out.println((i+1)+"번째학생의 점수를 입력하세요");
			int point =s.nextInt();
			st.setPoint(point);
			alPerson.add(st);
		}
		
		
	}
	void printPerson() {
		for(Person p:alPerson) {
			Student s = (Student)p;
			System.out.print(s.name);
			System.out.print(s.getPoint());
		}
	}
	public static void main(String[] args) {
		Excute e =new Excute();
		e.inputPersonCount();
		e.printPerson();
	}
}

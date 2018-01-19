package p02;

public class Exam01 {
	int a = 0;
	String str;
	Exam01(){
		a++;
		str="123";
	}
	Exam01(int a){
		this.a =a;
		
	}
	Exam01(int a,String str){
		this.a=a;
		this.str=str;
	}
public static void main(String[] org) {
	//1,123,3,null,5,str
	Exam01 e= new Exam01();
	System.out.println(e.a);
	System.out.println(e.str);
	e = new Exam01(3);
	System.out.println(e.a);
	System.out.println(e.str);
	e= new Exam01(5,"str");
	System.out.println(e.a);
	System.out.println(e.str);
}
}

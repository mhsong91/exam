package p02;

public class Exam03 {
	int[] arrNum;
	
	public static void main(String[] org) {
	Exam03 e=new Exam03();
	e.arrNum[0]=3;
	System.out.println(e.arrNum);
	}
}
//Exception in thread "main" java.lang.NullPointerException
//at p02.Exame03.main(Exame03.java:8)
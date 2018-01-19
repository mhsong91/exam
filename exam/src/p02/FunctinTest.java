package p02;

public class FunctinTest {
	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static String add2(int num1,int num2) {
		return num1+"과" +num2+"의합은"+(num1+num2)+"이란다.";
	}
	public static void main(String[] args) {
		add(1,2);
		String result= add2(1,9);
		System.out.println(result);
		result= add2(1,12
				);
		System.out.println(result);
		result= add2(1,14);
		System.out.println(result);
		System.out.println(add2(1,14));
		String a ="         3       1     ";
		System.out.println(a.trim()+"끝");
		System.out.println(a);
	}
}

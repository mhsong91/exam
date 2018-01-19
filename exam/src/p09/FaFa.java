package p09;

public class FaFa {

	protected  int a=3;
//	public void FaFa() {
//		System.out.println("아빠생성자호출");
//	}
	public FaFa(String str1, String str2) {
		System.out.print("아빠  생성자호출");
	}
	public void print() {
		System.out.println("내가니아빠야");
	}
	protected void print(String str) {
		System.out.println("내가 아빠야");
	}
}

package p03;

public class Test {
	String str;
	Test (String str) {
		this.str=str;
	}
			
	void print() {
		System.out.println(str);
	}
//	static void printlnln(int a){
//		System.out.println(a);
//	}
	
	
	public static void main(String[] args) {
	Test t= new Test("가나다ABC123");
//	String str = "나 있나요~~나";
	t.print();	
////	t.print(str.replace("나","명훈이"));
////	t.print(str);
//	System.out.println(str.IndexOf("나"));
//	str=str.substring(1);
//	System.out.println(str);
//	System.out.println(str.IndexOf("나"));
//	str=str.substring(3);
//	System.out.println(str);
////	System.out.println(str.substring(1));
//	System.out.println(str.IndexOf("나"));
//	
	}
	}

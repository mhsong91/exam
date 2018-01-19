package p02;

public class Operator {

	public static void main(String[] args) {
		int a =3;
		int b =a;
		int c =b;
				System.out.printf("%d,%d,%d",a,b,c);
		System.out.println("");
		
		for(int i=0;i<10;i++) {
		System.out.println((i+1)+".a와b는 같습니다.");
		
			
		}
		
		int len = 7;
		String[] strArr =new String[len];
			for(int i=0; i<strArr.length; i++)
			{
		strArr[i] =(i+1)+"0";
		System.out.println("strArr["+ i +"]=" +strArr[i]);
		}
			System.out.println("");
		for(len--; len>=0; len--) {
			System.out.println("strArr["+len+"]="+strArr[len]);
		
		}
		String str ="123";
		System.out.println(str.length());
		for(int i=5; i<=100;i+=5) {
		System.out.println(i);
		}
		for(int i=10; i<=100;i+=10) {
			System.out.println(i);
			}
		for(int i=100; i>0;i-=10) {
			System.out.println(i);
			}
		for(int i=100; i>0;i-=5) {
			System.out.println(i);
			}
		
	}
}
//		for(int i=10;i>0;i--) {
//			if(i%2=0) {//홀수일때
//				System.out.println((i)+".a와b는 같습니다.");
//			}
//		}
////		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a>=b);
//		System.out.println(a!=b);
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);



package p10;

public class Excute extends Father {
	public void print(Father f) {
		System.out.println(f.toString());
		}
	

	int a = 4;

	Excute() {
		super(1, 100);
	}

	public void print() {
//		for (int i = minNum; i <= maxNum; i++) {
//			if (((i / 10) % 3 == 0 && i > 10) || (i % 10) % 3 == 0) {
//					System.out.print("짝\t");
//			}
//			else {
//				System.out.print(i + "\t");
//			}
//
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//		}
//	}
	}
	public static void main(String[] args) {
		Father f1=new Excute();
		Excute e = new Excute();
		Father f =new Father(1,2);
		
		System.out.println(f1 instanceof Excute);
		System.out.println(f);
		e.print(f);
	}
}

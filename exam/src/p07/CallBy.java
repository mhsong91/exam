package p07;

public class CallBy {
	void doFunc(int[] a,int[] b) {
	a[0]=3;	
	b[0]=1;
	b[1]=2;
	}
	public static void main(String[] args) {
		int[] a=new int[1];
		int[] b=new int[2];
	CallBy cb = new CallBy();
	cb.doFunc(a, b);
	System.out.println(a[0]);
	System.out.println(b[0]+b[1]);
	
	
	
	
	
	}
}

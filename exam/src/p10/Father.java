package p10;

public class Father {
	 static final char[] toString = null;
	public int minNum;
	public int maxNum;
	
	public Father(int minNum, int maxNum) {
		this.minNum=minNum;
		this.maxNum=maxNum;
	}
	public String toString() {
		return "너냐?";
	}
	
	public void print() {
		for(int i=minNum;i<maxNum;i++) {
			System.out.print(i+"\t");
			if(i%10==0) {
				System.out.println("");
			}
		}
	}
}

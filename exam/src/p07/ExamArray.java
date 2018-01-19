package p07;

public class ExamArray {

	
	void print() {
		
	}
	
	public static void main(String[] args) {
		int[] a= new int[5];
		a[0]= 10;
		a[1]= 11;
		a[2]= 4;
		a[3]= 7; 
		a[4]= 21;
		int temp=0;
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j =i; j<a.length-1; j++) {
				
				if(a[i]<a[j+1]) {
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]= temp;
				}
				
			}
			
			
		}
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
}

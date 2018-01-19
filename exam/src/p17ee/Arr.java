package p17ee;

import java.util.Random;
import java.util.Scanner;

public class Arr {
	int[] num = new int[6];
	int a;
	
	boolean out(int[] num,int a) {
		for(int i=0;i<num.length;i++) {
			if(num[i]==a) {
			return true;	
			}
		}
		return false;
	}
	
	
	void inputnum() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		for(int i=0;i<6;i++) {
			a=r.nextInt(45)+1;
			if(out(num,a)){
				i--;
			}else {
				num[i]=a;
			}
		}
	}
		
	void jong() {
		for (int i = 0; i < num.length; i++) {
			for (int j = i+ 1; j < num.length; j++) {
				int tmp;
				if (num[i] < num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;

				}
			}
		}
	}

	void print() {
		for (int i = 0; i < 6; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] arg) {
		Arr a = new Arr();
		a.inputnum();
	
		a.jong();
		a.print();
	}

}

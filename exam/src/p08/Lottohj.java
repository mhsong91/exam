package p08;

import java.util.Random;

public class Lottohj {
	int[] rNums = new int[6];

	public static void main(String[] args) {
		Lottohj lt = new Lottohj();
		lt.getRan();
		lt.printRan();
		
	}
	
	void printRan() {
		String str = "";
		for (int i = 0; i < rNums.length; i++) {
			str += rNums[i] + ", ";
		}
		System.out.println("로또 당첨번호 입니다\n" + str.substring(0, str.length() - 2));
	}
	
	void getRan() {
		Random r = new Random();
		for (int i = 0; i < rNums.length; i++) {
			rNums[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (rNums[i] == rNums[j]) {
					rNums[i] = 0;
					i--;
				}
			}
		}
	}
	
}

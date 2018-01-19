package p08;

import java.util.Random;

public class Examjy {
	int[] intArr = new int[7];
	int rdNum = 0;
	Random rd = new Random();

	void initRandom() {

		for (int i = 0; i < intArr.length; i++) {
			rdNum = rd.nextInt(45) + 1;
			intArr[i] = rdNum;
			System.out.print(intArr[i]+", ");
		}
		System.out.println("");
	}

	void checkNum() {
		for (int i = 0; i < intArr.length; i++) {
			for (int x = i + 1; x < intArr.length; x++) {
				if (intArr[i] == intArr[x]) {
					System.out.println("intArr["+i+"]번 방의 값인 "+intArr[i]+"와 intArr["+x+"]번 방의 값인 "+intArr[x]+"의 값이 같습니다. 교체됩니다.");
					intArr[i] = rd.nextInt(45) + 1;
				}
			}

		}
	}

	void print() {
		for (int i = 0; i < intArr.length; i++) {
			if (i == intArr.length - 1) {
				System.out.print(intArr[i]);

			} else {
				System.out.print(intArr[i] + ", ");

			}
		}
	}

	public static void main(String[] args) {
			Examjy ex = new Examjy();
			ex.initRandom();
			ex.checkNum();
			ex.print();
	}

}

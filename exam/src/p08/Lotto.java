package p08;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					num[i] = 0;
					i--;
				}

			}

		}
		for (int i = 0; i < 6; i++) {
			System.out.println(num[i]);

		}
	}

}

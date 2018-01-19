package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int lottoCnt = 0;
	int joinCnt = 0;

	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원");
		joinCnt = s.nextInt();
		System.out.println("당첨인원");
		lottoCnt = s.nextInt();
		s.close();
	}

	int[] getLottos() {
		return new int[lottoCnt];
	}

	int[] getjoins() {
		return new int[joinCnt];
	}

	void setLottos(int[] lottos) {
		Random r = new Random();

		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt) + 1;

			if (isDopl(lottos, n)) {
				i--;
			} else {
				lottos[i] = n;
			}
		}
	}

	boolean isDopl(int[] lottos, int num) {
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		int[] lottos = l.getLottos();
		int[] joins = l.getjoins();
		System.out.println("당첨인원" + l.lottoCnt);
		System.out.println("비당첨" + (l.joinCnt - l.lottoCnt));
		for (int i = 0; i < joins.length; i++) {
			for (int j = 0; j < lottos.length; j++) {
				if (i == lottos[j] ) {
					System.out.print(lottos[i] + ",");
				}
			}

		}

	}
}

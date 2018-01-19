package p08;

import java.util.Random;

public class Lotto_jj {
	private int[] lottoNums;
	private int lottoMaxNum;
	private int checkRandomNum;
	private int[] checkLotooNums;

	public Lotto_jj() {
		this(6, 45);
	}

	public Lotto_jj(int lottoNumsLength) {
		this(lottoNumsLength, 45);
	}

	public Lotto_jj(int lottoNumsLength, int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;
	}
	void setcheckLotooNums(int[] checkLotooNums) {
		this.checkLotooNums=checkLotooNums;
	}

	void makeLottoNums() {
		Random r = new Random();
		for (int i = 0; i < lottoNums.length; i++) {
			checkRandomNum = r.nextInt(lottoMaxNum) + 1;
			if (isDupl()) {
				i--;
			} else {
				lottoNums[i] = checkRandomNum;
			}
		}

	}

	boolean isDupl() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == checkRandomNum) {
				return true;
			}
		}
		return false;
	}

	void printLottoNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + ",");
		}

	}

	public static void main(String[] args) {

		// int[] lottoNums = new int[6];
		Lotto_jj lt = new Lotto_jj();
		lt.makeLottoNums();
		lt.printLottoNums();
	

	}

}

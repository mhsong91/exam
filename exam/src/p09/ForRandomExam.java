package p09;

import java.util.Random;

import p08.goodloto;

public class ForRandomExam extends goodloto{
	int[][] num = new int[3][3];
	int rnum = 0;

		
	
		
	
	
	void room() {
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
			num[i][j]=r.nextInt(20)+1;
			
				
			
			System.out.print(num[i][j] + ",");
			}
		}

	}

	public static void main(String[] args) {
		ForRandomExam f = new ForRandomExam();
		f.room();

	}
}

package p02;

import java.util.Scanner;

public class LoopExam {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int minNum = s.nextInt();
		int maxNum = s.nextInt();
//		for (int i=minNum;i<=maxNum;i++) {
//			System.out.println(i);
//		}
//		for (int i=maxNum;i<=minNum;i++) {
//			System.out.println(i);
			int tmp=0;
			if(minNum>maxNum ) {
			tmp=minNum;
			minNum=maxNum;
			maxNum=tmp;
		}
			for (int i=minNum;i<=maxNum;i++) {
				System.out.println(i+",");
			}
			}
			}

package p09;

import java.util.Arrays;
import java.util.Random;

public class ForRandomExamhh {
	int[][] numArr=new int[3][3];
	
	public static void main(String[]args) {
		ForRandomExamhh fr=new ForRandomExamhh();
		fr.input();
		fr.sortNum();
		fr.print();
	}
	
	void sortNum() {
		int[] tempNum=new int[9];
		int temp=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tempNum[temp++]=numArr[i][j];
			}
		}
		Arrays.sort(tempNum);
		temp=0;
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
				numArr[i][j]=tempNum[temp++];
			}
		}
	}
	
	void print() {
		for(int i=0;i<numArr.length;i++) {
			String str="";
			for(int j=0;j<numArr[i].length;j++) {
				str+=numArr[i][j]+"\t";
			}System.out.println(str);
		}
	}
	
	boolean dupl(int chek) {
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				if(numArr[i][j]==chek) {
					return true;
				}
			}
		}
		return false;
	}
	
	void input(){
		Random r=new Random();
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				int ran=r.nextInt(20)+1;
				if(dupl(ran)) {
					j--;
					System.out.println("중복입니다");
				}
				else {
					numArr[i][j]=ran;
				}
			}
		}
	}
}

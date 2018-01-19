package p08;

import java.util.Random;

public class goodloto {
	
	boolean isDupl(int[] nums,int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Random r =new Random();
		goodloto gl=new goodloto();
		int[] lottoNums=new int[6];
		int cnt=0;
		for(int i=0; i<6;i++) {
			int rNum =r.nextInt(45)+1;
			if(gl.isDupl(lottoNums, rNum)) {
				cnt++;
				i--;
			}else {
				lottoNums[i]=rNum;
			}
		}
		System.out.println("중복횟수:"+cnt);
		for(int i=0;i<6;i++) {
			System.out.println(lottoNums[i]+",");
		}
		
	}
}

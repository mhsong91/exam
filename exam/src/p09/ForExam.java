package p09;

public class ForExam {
	
	
	

	public static void main(String[] args) {
		int[][] nums = new int[3][];

		int[] a = new int[3];
		int[] b = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];
		int cnt=1;
//		int addnum=1;
		// System.out.println(nums[0].length);
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {
//				if(i!=0) {
//					addnum += nums[i-1].length;
//				}
//				nums[i][j]= cnt++;	
			}
//				nums[i][j] = j + 1;
				

		}
		// System.out.println("");
		// for(int j=0;j<4;j++) {
		// nums[1][j]=(j+1);
		// System.out.print(nums[1][j]);
		// }
		// System.out.println(nums[1].length);
		// System.out.println(nums[2].length);
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+",");
			}
			
			System.out.println("");
		}
	}
}

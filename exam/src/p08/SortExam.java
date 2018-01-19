package p08;

public class SortExam {
	private static char[] duplStr;

	public static void main(String[] args) {
		int[] nums = { 1,2,2,3,3,4 };
		int cnt = 0;
		for (int j = 0; j < nums.length; j++) {
//		
//		int idx = j;
//		int num = nums[idx];
			String duplStr ="";
		for (int i = j + 1; i < nums.length; i++) {
			if (nums[j] == nums[i]) {
				cnt++;
				duplStr += nums[i]+",";
				System.out.println("중복~");
			}
			if(nums[j]==nums[i]) {
				System.out.println(nums[i]);
			}
		}
		}
			System.out.println("중복갯수"+cnt);
			System.out.println(duplStr);
	}
}

package p08;

public class Exam {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 3, 4 };
		int cnt = 0;
		for (int i = 0; i < nums2.length; i++) {
			int checknum = nums1[i];
			for (int j = 0; j < nums2.length; j++) {
				if ( nums2[j]==checknum) {
		cnt++;
		System.out.println(nums2[j] + "==" + checknum + ":" + (nums2[j] == nums1[i]));
				}
			}
		
			
		}
		System.out.println("같은거는"+cnt);
		// for(int i=0;i<nums1.length;i++) {
		// System.out.println(nums1[i]);
		// for(;;) {
		//
		// }
		// }

	}
}

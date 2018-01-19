package p07;

public class Exame03me {

public static void main(String[] args) {
	int[] nums =new int[5];
	nums[0]=9;
	nums[1]=5;
	nums[2]=3;
	nums[3]=2;
	nums[4]=6;
	 int tmp=0;
	
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]<nums[j]) {
				tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
				
			}
		}
		
			
		}
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);	
	}
	
	}
}


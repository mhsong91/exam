package p07;

import java.util.Scanner;

public class Exam011 {
	int[] nums;

	void inputnums() {
		Scanner s = new Scanner(System.in);
		nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			System.out.println("번쨰숫자를 입력하세요");
			nums[i]=s.nextInt();
		}
		
//		
//		System.out.print("값을 입력하세요");
//		num[0] = s.nextInt();
//		System.out.print("값을 입력하세요");
//		num[1] = s.nextInt();
//		System.out.print("값을 입력하세요");
//		num[2] = s.nextInt();
//		System.out.print("값을 입력하세요");
//		num[3] = s.nextInt();
//		System.out.print("값을 입력하세요");
//		num[4] = s.nextInt();
	}

	void print() {
		for (int i = nums[0]; i >= nums[1]; i--) {

			for (int j = nums[2]; j >= nums[3]; j--) {
				String str = i + "x" + j + "=" + (i * j );
				if (i * j % nums[4] == 0) {
					
					str = "num[4]의배수";
				}
				System.out.print(str);
								

				if (j != nums[3]) {
					System.out.print(",");
				}				
			}
			System.out.println("");
			
		}

		// for (int i = 9; i > 0; i--) {
		//
		// for (int j= 9; j > 0; j--) {
		// String str = i + "x" + j + "=" + (i * j+",");
		// if (i * j % 3 == 0) {
		// str = "3의배수";
		// }
		// System.out.print(str);
		//
		// if (j!= 1) {
		// System.out.print(",");
		// }
		// System.out.println("");
		// }
		// }

	}
	// int num1;
	// int num2;
	//
	// void inputNums() {
	// Scanner s = new Scanner(System.in);
	// num1 = s.nextInt();
	// num2 = s.nextInt();
	// }
	//
	// void initNumArr() {
	// for (int i = num1; i > 0; i--) {
	// for (int j = num2; j > 0; j--) {
	// String str = i + "x" + j + "=" + i * j + ",";
	// if (i * j % 3 == 0) {
	// str = "3의배수";
	// }
	// if(j==1) {System.out.print(i + "x" + j + "=" + i * j );
	//
	// }
	// System.out.print(str);
	// }
	// System.out.println(" ");
	// }
	// }

	public static void main(String[] args) {
		Exam011 e = new Exam011();
//		e.inputNums();
		e.print();

	}
}

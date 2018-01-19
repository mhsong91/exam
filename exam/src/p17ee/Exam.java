package p17ee;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
	int str;
	ArrayList<Integer> al;

	Exam() {
		al = new ArrayList<Integer>();

	}

	void inpunum() {
		Scanner s = new Scanner(System.in);
		// System.out.println("점수를 입력해주세요");
		for (int i = 0; i < 5; i++) {
			System.out.println("점수를 입력해주세요");
			str = Integer.parseInt(s.nextLine());
			al.add(str);
		}
		System.out.println("합은?");
		System.out.println(al.get(1) + al.get(2) + al.get(3) + al.get(4) + al.get(0));
		System.out.println("평균은?");
		System.out.println((al.get(1) + al.get(2) + al.get(3) + al.get(4) + al.get(0)) / 5);

	}

	void sel() {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) < al.get(j)) {
					Integer tmp = al.get(i);
					Integer tmpp = al.get(j);
					al.set(i, tmpp);
					al.set(j, tmp);
				}
			}
		}
	}

	void print() {
		for (Integer ss : al) {
			System.out.println(ss);
		}

	}

	public static void main(String[] args) {
		Exam e = new Exam();
		e.inpunum();
		e.sel();
		e.print();
	}
}

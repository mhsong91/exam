package p04;

import p03.GuGuDan;
import p03.ObjectExam;
import p03.ObjectExam01;

public class Excute {
	public static void main(String[] args) {
		ObjectExam01 oe = new ObjectExam01();
		oe.inputnums();
		GuGuDan ggd = new GuGuDan();
		 ggd.printLoop(oe);
	}
}

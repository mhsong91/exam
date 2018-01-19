package p11;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("월");
		al.add("화");
		al.add("수");
		al.add("목");
		al.add("금");
		al.add("토");
		al.add("일");
		for(String i:al) {
			System.out.print(i);
		}
	}
}

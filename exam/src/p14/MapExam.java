package p14;

import java.util.ArrayList;

public class MapExam {
	private ArrayList<String> alkey;
	private ArrayList<String> alValue;

	public MapExam() {
		alkey = new ArrayList<String>();
		 alValue = new ArrayList<String>();
	}
	public void put(String key, String value) {
		int idx = alkey.indexOf(key);
		if(idx==-1) {
			alkey.add(key);
			 alValue.add(value);
//			alValue.set(idx,value);
		}else {
			alValue.set(idx,value);
//		alkey.add(key);
//		 alValue.add(value);
		}
	}
	public int size() {
		return alkey.size();
	}
	public boolean remove(String key) {
		int idx =alkey.indexOf(key);
		if(idx==-1) {
			return false;
		}else {
			alkey.remove(idx);
		alValue.remove(idx);
//		return true
		}
			return true;
	}
	public String toString() {
		String str = "{";
		for(int i=0;i<alValue.size();i++) {
			str += alkey.get(i)+"=" + alValue.get(i);
					//			alValue.get()
		}
		return str+ "}";
//		return "이름은"+alValue.get(0)+"나이는"+alValue.get(1);
	}
	
	public String get(String key) {
		if(alkey.indexOf(key)==-1){
			return null;
		}
		
		int idx =alkey.indexOf(key);
		return  alValue.get(idx);
	}
}

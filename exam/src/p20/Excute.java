package p20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {

	public static void main(String[] args) {
		Service s = new Service();
		LinkedHashMap<String,Object> hm=
				new LinkedHashMap<String,Object>();
		ArrayList<HashMap<String,Object>> ah
		= new ArrayList<HashMap<String,Object>>();
		hm.put("cidescr","정보 보안반");
		hm.put("cino",3);
		int result =s.updateClassInfo(hm);
		if(result==1) {
			System.out.println("업데이트 됨");
			
			
		}
		hm = new LinkedHashMap<String,Object>();
		hm.put("a","b");
		hm.put("c","d");
		s.insertInfo(hm);
		System.out.println(hm);
		
		
			
		}
	}


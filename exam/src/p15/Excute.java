package p15;

import java.util.ArrayList;

public class Excute {
	
	
//	public static void print(Server s1) {				
//	s1.print();		
//		if( s1 instanceof Controller) {
//			((Controller)s1).print(1);
//			Controller c = (Controller)s1;
//			c.print(1);			
//		}else{			
//			s1.print();			
//		}		
//	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		User u = new User("nana", 30);
//		System.out.println(u);
//		
//		ArrayList<User> userList = new ArrayList<User>();
//		
//		userList.add(u);
//		
//		u = new User("mimi", 20);		
//		userList.add(u);
//		
//		u = new User("popo", 10);		
//		userList.add(u);
//		
//		for(User uu : userList) {
//			
//			System.out.println(uu);
//		}
		
		
		
//		DAO dao = new DAO();
//		
//		ArrayList<User> userList = dao.getUserList("");
		
		
		
		Controller c = new Controller();
//		ArrayList<User> userList = c.get("List");
		
		for(int i=1; i<=5; i++) {			
			User user = new User("이름" + i, i, i);
			c.get("add", user);					
		}
		
		ArrayList<User> userList = c.get("List", null);
		
		for(User uu : userList) {			
			System.out.println(uu);			
		}
		
		User ru = new User(3);
		c.get("remove", ru);		
		for(User uu : userList) {			
			System.out.println(uu);			
		}
		
//		ru.setName("이름1");
		
//		userList = c.get("search", ru);
//		System.out.println("검색결과");
//		for(User uu : userList) {			
//			System.out.println(uu);			
//		}
		
		User user = new User("momo", 20, 2);
			c.get("update", user);
			
			for(User uu : userList) {			
				System.out.println(uu);			
		}
			
			
		
		
		
		
//		Server s1 = new Controller();
//		Server s2 = new Service();
//		print(s1);  // Server를 Controller로 casting 할 수 있다.
//		print(s2);  // 요기서는 Service가 Controller로 casting 할수 없다.
		
		
		
		
		
		
		
		
		
	}

}

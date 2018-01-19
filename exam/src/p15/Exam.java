package p15;

import java.util.ArrayList;

public class Exam {
	
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		
		for(int i=0; i<5; i++) {
			User u = new User("name", i, i);			
			users.add(u);			
		}
		
		User u = users.get(0);
		u = new User("test", 1, 2);
		u.setName("test");
		for(User user : users) {
			
			System.out.println(user);			
		}
		
		
	}

}

package p15;

import java.util.ArrayList;

public class Controller {
	
//	public void print() {
//		super.print();
//		System.out.println("그리고 컨트롤도 담당합니다. ");
//		
//	}
//	
//	public void print(int a) {
//		
//		super.print();
//		System.out.println("그리고 숫자도 출력합니다. :" + a);
//		
//		
//	}
	
	private Service service;
	
	public Controller() {		
		service = new Service();		
	}
	
	public ArrayList<User> get(String command, User user) {
		
		if(command.equals("List")) {
			
			return getUserList(null);
			
		}
		else if(command.equals("add")) {						
			boolean isOk = insertUser(user);
			if(isOk) {
				
				System.out.println(user.getName() + "입력 완료!");
				
			}else {
				System.out.println("입력중에 알수 없는 에러가 발생했습니다.");				
			}			
		}
		else if(command.equals("remove")) {
			boolean isOk = removeUser(user);
			if(isOk) {				
				System.out.println(user.getName() + "삭제완료!");				
			}else {				
				System.out.println("삭제 중에 알수 없는 에러가 발생했습니다.");				
			}			
		}
		else if(command.equals("search")) {
			
			return getUserList(user.getName());
			
		}
		else if(command.equals("update")) {
			boolean isOk = updateUser(user);
			if(isOk) {
				System.out.println(user.getName() + "수정완료!");	
				
			}else {				
				System.out.println("수정 중에 알수 없는 에러가 발생했습니다.");	
			}			
		}
		return null;			
	}
	
	
	
	public ArrayList<User> getUserList(String str){		
		return service.getUserList(str);		
	}
	
	public boolean insertUser(User user) {		
		return service.insertUser(user);		
	}
	
	public boolean removeUser(User user) {		
		return service.removeUser(user);		
	}
	
	public boolean updateUser(User user) {		
		return service.updateUser(user);		
	}
	
	
	

}

package p13;

public class Person1 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getAge() {
		return age;
		
		
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public String toString() {
		System.out.println("이름은:"+name+",나이는:"+age+",");
		return "";
	}

}
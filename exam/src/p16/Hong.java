package p16;

public class Hong extends person{

	
	public Hong(String name, int age, int height, String email) {
		this.name =name;
		this.age= age;
		this.height = height;
		this.email =email;
	}
	
	public void eat() {
		System.out.println("밥먹고싶다");
	}
	public void eat(String spam) {
		System.out.println("밥먹자 이세끼들아");
	}
}

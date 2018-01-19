package p16;

public class Cat extends Animal{

	public Cat(String name, int age,int height) {
		this.name =name;
		this.age=age;
		this.height=height;
	}
	public void eat() {
		System.out.println(name+"이가 사료냠냠");
		
	}
	public void sleep() {
		System.out.println(age+" 잠을 단자");
		
	}
	public void walk() {
		System.out.println(name+"걷는다");
	}
		
	
}

package p16;

public class person implements Action {

	public String name;
	public int age;
	public int height;
	public String email;

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}

	@Override
	public void eat() {
		System.out.println("e호출");

	}

	@Override
	public void sleep() {
		System.out.println("s호출");

	}

	@Override
	public void walk() {
		System.out.println("w호출");
	}

}

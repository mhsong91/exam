package p16;

public class Excute {
	
	public void prinAction(Action act) {
		act.eat();
		act.sleep();
		act.walk();
	}
	
	
	
	public static void main(String[] args) {
//		person p =new Hong("hong",20,159,"gogogo");
//		Action p =new Hong("hong",20,159,"gogogo");
		Hong Hong =new Hong("hong",20,159,"gogogo");
		Excute e =new Excute();
//		e.prinAction(Hong);
		Cat c =new Cat("냥냥",41,15);
		e.prinAction(c);
//		System.out.println(p);
//		p.eat();
//		((Hong)p).eat("dddddddddd");
//		p.sleep();
//		p.walk();
			
	}

}

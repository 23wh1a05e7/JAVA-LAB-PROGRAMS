package java_programs3;
class wild1{
	void eat() {
		System.out.println("wild animals eat meat");
	}
	void sound() {
		System.out.println("wild animals sounds scary");
	}
}

class Lion extends wild1{
	void eat() {
		System.out.println("lion eat meat");
	}
	void sound() {
		System.out.println("lion roars");
	}
}
class Tiger extends wild1{
	void eat() {
		System.out.println("Tiger eat deer");
	}
	void sound() {
		System.out.println("Tiger sounds scary");
	}
}
class Panther extends wild1{
	void eat() {
		System.out.println("Panthers eat flesh");
	}
	void sound() {
		System.out.println("Panther sounds scary");
	}
}

public class Wild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		Tiger t=new Tiger();
		Panther p=new Panther();
		l.eat();
		l.sound();
		t.eat();
		t.sound();
		p.eat();
		p.sound();
		
		
	}

}

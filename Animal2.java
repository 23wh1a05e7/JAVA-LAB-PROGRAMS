package java_programs3;
class Animal{
	void move() {
		System.out.println("cheetah is moving");
	}
}
class cheetah extends Animal{
	void move() {
		System.out.println("cheetah is running");
	}
}

public class Animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cheetah c=new cheetah();
		c.move();
	}

}

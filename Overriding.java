package java_programs2;
class Animal{
	public void display() {
		System.out.println("IT IS A DOG");
	}
}
class dog extends Animal{
	public void display() {
		System.out.println("IT IS A GOLDEN DOG");
	}
}
public class Overriding {
	public static void main(String[]args) {
		dog d1=new dog();
		d1.display();
	}

}

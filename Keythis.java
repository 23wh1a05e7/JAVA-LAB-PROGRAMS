package java_programs2;
import java.util.Scanner;
class Student{
	String name;
	int age;
	void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class Keythis {
	public static void main(String[]args) {
		Student s=new Student();
		Scanner s1=new Scanner(System.in);
		s.name=s1.nextLine();
		s.age=s1.nextInt();
		s.display();
	}

}

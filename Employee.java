package java_programs3;
class Person{
	void getFirstName() {
		System.out.println("Raj");
	}
	void getLastName() {
		System.out.println("kumar");
	}
}
class Employee1 extends Person{
	void  getEmployeeId() {
		System.out.println("234");
	}
	void getLastName() {
		System.out.println("Manager");
}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		e.getLastName();
		e.getFirstName();
		e.getEmployeeId();
	}

}

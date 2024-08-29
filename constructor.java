package java_programs3;

public class constructor {
	String name;
	int age;

public constructor() {
	name="Unknown";
	age=0;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor obj=new constructor();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}

}

package java_programs3;

public class Outer_class {
	class processor{
		void display_details() {
			int speed=120;
			String brand="lenovo";
			System.out.println(speed+","+brand);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_class obj=new Outer_class();
		Outer_class.processor obj2=obj.new processor();
		obj2.display_details();
	}

}

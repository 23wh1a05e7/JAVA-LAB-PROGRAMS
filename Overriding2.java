package java_programs3;
class Shape1 {
	
	void getArea() {
		System.out.println("area of square");
		
	}
}
	
class Rectangle extends Shape1 {
	void getArea() {
		System.out.println("area of rectangle");			
	}
}


public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle();
		a.getArea();
	}

}

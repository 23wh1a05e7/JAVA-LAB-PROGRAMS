package java_programs2;

class ar{
	int x,y;
	public int Square(int x) {
	 return (x*x);
	}
	public int Rectangle(int x,int y) {
		return (x*y);
	}
	public double Circle(int y) {
		return((3.14)*y*y);
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ar a=new ar();
		System.out.println(a.Square(3));
		System.out.println(a.Rectangle(3, 2));
		System.out.println(a.Circle(4));

	}

}

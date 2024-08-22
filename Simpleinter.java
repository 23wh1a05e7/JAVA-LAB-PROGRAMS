package java_programs2;
import java.util.Scanner;
class Cal{
	int p,t,r;
	void simple() {
		int w=(p*t*r);
		System.out.println(w/100);
		}
}
public class Simpleinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Cal obj=new Cal();
		Scanner si=new Scanner(System.in);
		obj.p=si.nextInt();
		obj.t=si.nextInt();
		obj.r=si.nextInt();
		obj.simple();
	}

}

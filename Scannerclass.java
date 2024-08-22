package java_programs2;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter student name:");
		 String s=input.nextLine();
		 System.out.println("My name is "+s);
		 System.out.println("enter roll number:");
		 int r=input.nextInt();
		 System.out.println("My rollnum is "+r);
	}

}

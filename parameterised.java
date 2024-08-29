package java_programs3;

public class parameterised {
	String n;
	String c;
public parameterised(String name,String color) {
	n=name;
	c=color;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterised obj=new parameterised("snoopy","white");
		System.out.println(obj.n);
		System.out.println(obj.c);
	}

}

package java_programs2;
class employee{
	int salary=60000;
}
class engineer extends employee{
	int bonus=10000;
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engineer e1=new engineer();
		System.out.println(e1.salary+e1.bonus);

	}

}

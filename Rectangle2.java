package java_programs3;
public class Rectangle1{
	private int length;
	private int breadth;
int getvaluesl() {
	return length;
}
int getvaluesb() {
	return breadth;
}


void setvaluesl(int l) {
	this.length=l;}
void setvaluesb(int b) {
	this.breadth=b;
	
}
}


public class Rectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 r=new Rectangle1();
		r.setvaluesl(4);
		System.out.println(r.getvaluesl());
}

	}


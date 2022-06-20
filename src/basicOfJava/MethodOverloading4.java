package basicOfJava;

public class MethodOverloading4 {

	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
	public static void main(String[] args) {
		MethodOverloading4 obj = new MethodOverloading4();		
		obj.square(2.5f);
		obj.square();
		obj.square(5);
	}
}

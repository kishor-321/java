package basicOfJava;

class Multiply {
	
	Multiply(){ //constructor
		System.out.println("Zero-para cons..");
	}
	Multiply (double p) {
		System.out.println("call the double para cons");
	}
	void mul(int a, int b) { //method
		System.out.println("Sum of two=" + (a * b));
	}

	void mul(int a, int b, int c) { //method
		System.out.println("Sum of three=" + (a * b * c));
	}
}
public class ConsOverLoading3 {
	public static void main(String args[]) {
		Multiply m1 = new Multiply(); //constructor call when object created
		Multiply m11 =new Multiply (20.5); //for constructor need to create the second object and for method we can call from any object which ever in the class 
		m1.mul(6, 10); // one class one object but for constructor we need different object for call constructor
		m1.mul(10, 6, 5);
	}
}

/**
 * Method Overloading: a class having same method more than once
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */
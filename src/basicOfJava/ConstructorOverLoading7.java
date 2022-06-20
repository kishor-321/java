package basicOfJava;

class SuperClass {
	void msg(int x, int y) {
		System.out.println("Hello Java");
		System.out.println(y +" y and x " +y);
	}
}

class Subclass {
	void msg(double a, double b) {
		System.out.println("Welcome you in Java programming");
		System.out.println(a +" a nd b "+b);
	}
}

public class ConstructorOverLoading7 {
	public static void main(String[] args) {
		Subclass sc = new Subclass();
		sc.msg(10, 20);
		sc.msg(2.5, 3);
		SuperClass sc1=new SuperClass();
		sc1.msg(20, 30);
	}
}
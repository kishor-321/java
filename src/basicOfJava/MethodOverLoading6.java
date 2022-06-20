package basicOfJava;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static void call() {
		System.out.println("I am call() of Adder class");
	}
}
public class MethodOverLoading6 {
	static void call() {
		System.out.println("I am call() of MethodOverloading3 class");
	}
	public static void main(String[] args) {
		System.out.println("hello adder ="+Adder.add(11, 11)); //first way of call / concatination need while you have semicolun in it
		System.out.println(Adder.add(11, 11, 11));//second way of call
		Adder.call();
		//call();
		//or
		MethodOverLoading6.call();
	}
}

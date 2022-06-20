package basicOfJava;


class A2 {
	A2() {
		this(5);
		System.out.println("hello a");
	}
	A2(int x) {
		System.out.println(x); //1 only one casue of not having this statement
	}
}
class ThisStatement2 {
	public static void main(String args[]) {
		A2 a = new A2(10);
	}
}

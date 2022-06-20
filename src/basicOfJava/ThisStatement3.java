package basicOfJava;


class A5 {
	A5() {
		this(5);
		System.out.println("hello a");
	}
	A5(int x) {
		System.out.println(x); //only1
	}
}
class ThisStatement3 {
	public static void main(String args[]) {
		A2 a = new A2(10);
	}
}

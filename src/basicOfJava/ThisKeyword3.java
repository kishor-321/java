package basicOfJava;

class K {
	void m() {
		System.out.println("hello m");
		this.n();
	}
	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
	
	}
}
class ThisKeyword3 {
	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
		//methodOne();
	}
	public static void main(String args[]) {
		K a = new K();
		a.m();
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodTwo();
		
	}
}

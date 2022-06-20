package basicOfJava;

public class MethodOverLoading8 {
	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}
	void disp(int x, int y) {
		System.out.println("Method D");
	}

	public static void main(String args[]) {
		MethodOverLoading8 obj = new MethodOverLoading8();
		obj.disp(100, 20);
	}
}
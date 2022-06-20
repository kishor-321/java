package basicOfJava;

public class constrctoroverloading6 {
//}
//public class constrctoroverloading6 {

	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		constrctoroverloading6.main(12);
		constrctoroverloading6.main('c');
		constrctoroverloading6.main(1236);
	}
}

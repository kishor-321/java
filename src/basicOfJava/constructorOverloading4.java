package basicOfJava;

public class constructorOverloading4 {
	/* fix the error in */
	constructorOverloading4 () {
		System.out.println("cons call");
	}
	int sum(int g, int h) { 
		System.out.println("method1");
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println("method2");
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String args[]) {
		constructorOverloading4 ob = new constructorOverloading4();
		int result1 = ob.sum(20, 20);  //for call from main () need     return type =object.methodname( para )
		double result2 = ob.sum(20, 20.56);
	}
}

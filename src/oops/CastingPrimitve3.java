package oops;
public class CastingPrimitve3 {

	public static void main(String[] args) {

		double myDouble = 9.78d; //implicit
		int myInt = (int) myDouble; // Manual casting: double to int // explicit
//narrowing
		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}

}

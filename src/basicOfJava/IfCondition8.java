package basicOfJava;

public class IfCondition8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		int weight = 51;
		// applying condition on age and weight
		if (age >= 18) {
			System.out.println("Condidate age is: " +age);
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}

package oops;
class Student3 {
	// private data member
		private int pinCode = 411015;
		// getter method for college
		public void setPinCode(int pin) {
			pinCode=pin;// this keyword is not neccessary becasue the having the global variable is have an only one 
		}
}
public class Encapsulation6 {// write only through setter

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student3 s = new Student3();
		// getting value of the name member
		s.setPinCode(12345);
		System.out.println("Bye");
	}
}

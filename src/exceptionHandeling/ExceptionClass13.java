package exceptionHandeling;

//Throwing UserDefinedException 
//class represents user-defined exception  

class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionClass13 {

	public static void validateAge(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			try {
				throw new UserDefinedException("Person is not eligible to vote");
			} catch (UserDefinedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String args[]) {
	
		validateAge(15);
		System.out.println("Rest of the code..");
	}
}
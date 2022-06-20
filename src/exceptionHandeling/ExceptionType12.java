//package exceptionHandeling;
//
////Throwing UserDefinedException 
////class represents user-defined exception  
//class UserDefinedException extends Exception {
//	public UserDefinedException(String str) {
//		// Calling constructor of parent Exception
//		super(str);
//	}
//}
////Class that uses above MyException  
//public class ExceptionType12 {
//
//	public static void validateAge(int age) throws UserDefinedException {
//		if (age < 18) {
//			// throw Arithmetic exception if not eligible to vote
//			throw new UserDefinedException("Person is not eligible to vote");
//		} else {
//			System.out.println("Person is eligible to vote!!");
//		}
//	}
//
//	public static void main(String args[]) throws UserDefinedException {
//	
//		try {
//			validateAge(15);
//		} catch (UserDefinedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Rest of the code..");
//	}
//}

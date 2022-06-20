package basicOfJava;

public class global_Variable1 {
	//Global Variable
	static int empID=123;//non-static global variable or instance variable
	 double salary=45000.25;//static global variable or class variable
	
	public static void main(String[] args) {
		int age=30;//local variable
//		global_Variable1 s2=new global_Variable1();
//		System.out.println("+empid ="+s2.empID); here we try to call the static global varible via object creation 
	}

}

/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 		a. static global variable or class variable -----> always contains static keyword
 *      b. non-static global variable or instance variable -----> doesn't contains static keyword
 */

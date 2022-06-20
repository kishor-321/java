package basicOfJava;

public class GlobalVariable4 {
	//Global Variable
	static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int age=30;//local Variable
		System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Direct way to access SGV, EmpID: "+empId);//123
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable4.empId);//123		
	}
}

/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.static global variable or class variable:
		1. declared with static keywords
		2. class variable or class member
		3. loaded in the memory at compile time because they are class member
		4. can be access using classname or directly inside another static method
				classname.staticvariablename
		5. for static member memory location happens only once  
 */

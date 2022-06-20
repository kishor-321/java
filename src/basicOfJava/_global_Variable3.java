package basicOfJava;

public class _global_Variable3 {
	//Global Variable
	static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int empId=100,age=30;//local Variable
		
		System.out.println("Local Variable, EmpID: "+empId);//100
		System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Standard way to access SGV, EmpID: "+_global_Variable3.empId);//123
			
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

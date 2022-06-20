package basicOfJava;

public class globalVariable5 {
	//Global Variable
	static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int age=30,empId=800;//local Variable
		System.out.println("Local Variable, Age: "+age);//
		age=45;
		System.out.println("Updated, Local Variable, Age: "+age);//
		System.out.println("Local Variable, EmpID: "+empId);//800
		System.out.println("Standard way to access SGV, EmpID: "+globalVariable5.empId);//123
		empId=456;//updating local variable value
		System.out.println("updated, Local Variable,, EmpID: "+empId);//456
		globalVariable5.empId=987;//updating Global static variable value
		System.out.println("updated, Standard way to access SGV, EmpID: "+globalVariable5.empId);//	
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

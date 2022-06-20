package basicOfJava;

public class globalVariable9 {
	//Global Variable
	int empId=123;//non-static global variable or class variable
	public static void main(String[] args) {
		System.out.println("Program starts..");
		
		//create an instance/object of a class
		globalVariable9 g1;  // object not created here
		g1=new globalVariable9(); // object create here
		System.out.println("Non-static global variable empId with g1 ref: "+g1.empId);
		g1.empId=456;//updating non-static global variable value
		System.out.println("updated, Non-static global variable empId with g1 ref: "+g1.empId);
		
		//creating again new instance
		globalVariable9 g2 = new globalVariable9();
		System.out.println("Non-static global variable empId with g2 ref: "+g2.empId);
		System.out.println("Program ends..");
	}
}

/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.non-static global variable or instance variable:
		1. declared without static keywords
		2. known as instance/object member
		3. loaded in the memory at run time because they are instance/object member which are created at runtime
		4. create an instance: 
				classname referencevariable;        // no object created
				referencevariable = new className();// object created
							//or
				classname  referenacevariable = new classname();
		5. to access them you need to use 
				referenacevariable.nonstaticvariablename;
				//or you can access nonstaticvariable directly from another nonstatic method
		5. for non-static member memory location happens multiple times based on object creation 
 */

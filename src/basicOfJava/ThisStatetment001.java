package basicOfJava;

public class ThisStatetment001 {

	ThisStatetment001()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");//3
	}
	ThisStatetment001(int age)
	{
		System.out.println("******int-Param*********"); //1
	}
	ThisStatetment001(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********"); //2
	}
	public static void main(String[] args) {
		
		ThisStatetment001 t1=new ThisStatetment001();
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */

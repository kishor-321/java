package basicOfJava;

public 
class Variable9
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..");
		//pi*r*r
		int r=10;
		double res= (22/7)*r*r;
		//			3.14-->3*10*10=300
		System.out.println("Area of circle1: "+res);//300.0
		res= 3.14*r*r;
		//	 3.14-->3.14*10*10=300
		System.out.println("Area of circle2: "+res);//314.0

		res= (22.0/7)*r*r;
		//	 3.14-->3.14*10*10=300
		System.out.println("Area of circle3: "+res);//314.285714
		System.out.println("Program Ends..");
	}
}

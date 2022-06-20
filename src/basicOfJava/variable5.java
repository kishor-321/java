package basicOfJava;

 public class variable5
{
	public static void main(String[] args) 
	{
		System.out.println("Progarm Starts");
		/*
		* declaration syntax: datatype variablename;
		* initiliazation    : variablename = value;
					//or
		* declaration & initiliazation: datatype variablename = value;
		*/	
		int num1=25,num2=35,result;
		result=num1+num2;

		//System.out.println("Hello Good Morning Everyone.\nWelcome to automation classes.");
		//System.out.println("First number is:\t"+num1);
		//System.out.println("Second number is:\t"+num2);
		//System.out.println("Sum of two numbers is:\t"+result);		

		System.out.println("First number is:\t"+num1+"\nSecond number is:\t"+num2+"\nSum of two numbers is:\t"+result);	
		System.out.println("Progarm Ends");
	}
}

/*
Variable 1.----> points to the memory location--->data ---> can be change based on requirement --->Variable
		 2.----> is a container --> which holds the value ---> while writing the program
		 3.----> is a container or memory location---> which holds the value ---> value can be change based on requirement ---> Variable
*/
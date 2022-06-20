package basicOfJava;

public class variable1 {

	public static void main(String[] args) {
		System.out.println("program start");
		
		/*
		* declaration syntax: datatype variablename;
		* initiliazation    : variablename = value;
					//or
		* declaration & initiliazation: datatype variablename = value;
		*/
		int age;
		age= 30;
		System.out.println("age");
		System.out.println("age ="+age);
		
		float salary;
		salary = 10000;
		System.out.println("salary");
		System.out.println("salary ="+salary);
		
		System.out.println("program end here");
	}

}

/*
addition = num 1 + num 2 = num3 
concatination = num 1 + num 2 + non_number = num3non_number
concatination = num 1 + non_number + num 2 = num1non_numbernum3
*/

/*
Variable 1.----> points to the memory location--->data ---> can be change based on requirement --->Variable
		 2.----> is a container --> which holds the value ---> while writing the program
		 3.----> is a container or memory location---> which holds the value ---> value can be change based on requirement ---> Variable
*/
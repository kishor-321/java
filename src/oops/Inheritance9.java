package oops;

//parent class
class Company {
	 //global variable
	static int score =25; 
	//method with method overloading use of this keyword
	void method1 () {
		this.method1();
		System.out.println("Im method 1 from company");
	}
	void method1 (int q) {
		System.out.println("Im method2 from company");
	}
	//constructor with overloading and use of this()
	Company () {
		
		System.out.println("Im const 1 from company");
	}
	Company (int w) {
		this();
		System.out.println("Im cons 2 from company");
	}
}
//child class of Company
class Employee extends Company {
	//global variable name as Company name variable
	
	int score = 35;
	
	//method with method overloading use of this & super keyword
	void method3 () {
		System.out.println("Im method 3 from Employee");
		this.method3(10);
	}
	void method3 (int e) {
		System.out.println("Im method 4 from employee");
	}
	//constructor with overloading and use of this() & super()

	Employee () {
		super(5);
		System.out.println("Im const 3 from Employee");
	}
	Employee (int r) {
		this();
		System.out.println("Im const 4 from Employee");
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		System.out.println("***********calling vaarible ***************");
//		System.out.println("Calling the Global Variable ="+score);
//		System.out.println("Calling Thr Global Variable ="+this.score );
		System.out.println("**********creating the Object ************");
		Employee res1= new Employee (5);
		res1.method3(5);
		System.out.println("Call variavle from employee = "+res1.score);
		//im need to use static variable other wise i need to create an object for class Company
		System.out.println("call Varaible FRom Company = "+Company.score);

		
		
		
	}

}

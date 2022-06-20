package basicOfJava;

public class Block8 {


	static int age = 25;
	double salary = 15000.57;
	static {
		age=35;
	}
	void print() {
		System.out.println("age: " + Block8.age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
//		System.out.println(" call static variable age ="+Block8.age); //not possible to call variable age
		Block8 b1 = new Block8();
		b1.print();//
		b1.salary=45000.32; 
		b1.print();//
		System.out.println("main() ends..");
	}
	
	
	
}
//Block >>> class >> Local
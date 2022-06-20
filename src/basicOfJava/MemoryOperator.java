package basicOfJava;

public class MemoryOperator {	
	static int salary;
	int empId;	
	void display() {
		System.out.println("I am display()...");
	}
	static void print() {
		System.out.println("I am print()...");
	}
	public static void main(String[] args) {
		//access static members---> static variable and method
		System.out.println("static variable salary: "+MemoryOperator.salary);//0
		MemoryOperator.print();		
		//access non static members---> non-static variable and method
		MemoryOperator m1=new MemoryOperator();
		System.out.println("non-static variable empId: "+m1.empId);//0
		m1.display();		
		//update static member
		MemoryOperator.salary=25000;
		System.out.println("update static variable salary: "+MemoryOperator.salary);//25000
		//update non-static member
		m1.empId=205;
		System.out.println("update non-static variable empId: "+m1.empId);//205		
		MemoryOperator m2=new MemoryOperator(); // new object created
		System.out.println("2nd instance non-static variable empId: "+m2.empId);//0
		m2.display();
	}
}

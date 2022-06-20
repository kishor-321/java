package basicOfJava;
class ConstructorOverLoading8 {
	static int age;
	int salary =20;//global variable
	int empId=25;
	void display(int salary) //int salary=45000;
	{
		System.out.println("Salary from simple way "+salary);//45000 //given value to method call
		System.out.println("Salary this keyword 1st "+this.salary);//0 global value will declare
		this.salary=35000;
		System.out.println("Salary update value in this 2nd "+this.salary);//0 updated value
	}
	
//public class ConstructorOverLoading8 {
//}
	public static void main(String[] args) {
		int age=25;
		System.out.println("age: "+age);
		System.out.println("global age:"+ConstructorOverLoading8.age);
		int salary=25000;//local variable
		int empId=250;
		System.out.println("local Salary: "+salary);//
		System.out.println("Local EmpId: "+empId);
		System.out.println("*******************************");
		ConstructorOverLoading8 t1=new ConstructorOverLoading8();
		System.out.println("t1: Global EmpID: "+t1.empId);
		System.out.println("t1: Global Salary: "+t1.salary);
		System.out.println("**************************************");
		t1.display(45000);
		System.out.println("t1: Global Salary: "+t1.salary); //latest upadated value via this keyword
		System.out.println("******************************");
		ConstructorOverLoading8 t2=new ConstructorOverLoading8();
		System.out.println("t2: Global EmpID: "+t2.empId);
		System.out.println("t2: Global Salary: "+t2.salary);//
		t2.display(5000);	
	}
}
/**
 * this keyword is an instance of current class
 * this keyword is used to differentiate non-static local and global variable 
 * when they have same name
 * this keyword can be used only for non-static method
*/
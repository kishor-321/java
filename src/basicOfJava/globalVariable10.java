package basicOfJava;

public class globalVariable10 {
	//Global Variable
	int empId;
	static double salary;
	public static void main(String[] args) {
		System.out.println("Program starts..");
		System.out.println("****************Access static global variable**********************");
		System.out.println("SGV salary: "+salary);//0.0
		System.out.println("With Std, SGV salary: "+globalVariable10.salary);//0.0
		System.out.println("****************Access non-static global variable**********************");
		globalVariable10 v1=new globalVariable10();
		System.out.println("NSGV empId: "+v1.empId);
		System.out.println("Program ends..");
	}
}
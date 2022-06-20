package oops;





public class encapsulation1 {
	int age = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation1 p1=new encapsulation1(); //calling from same class
		System.out.println("p1.age ="+p1.age);
		encapsulation12 p11 =new encapsulation12();// Create an object of another class
		System.out.println("salary ="+p11.getSalary()); //calling another class instance member via getter and setter method

		System.out.println("code ="+p11.getCode());//call code
		p11.setCode(25); //without set class we can not update any value i.e. write only
		p11.setSalary(2000);// same as above without setter method we can't access this updated value
		System.out.println("update via code setter ="+p11.getCode());
		System.out.println("update via salary set ="+p11.getSalary());
	}

}
class encapsulation12 {
	private double salary=25000;
	private int code=2500;

	public int code() {
		return getCode(); //use for go to public
	}
	public int getCode() { // use for the go for read only
		return code;
	}

	public void setCode (int code) { // use for the go for write and read 
		this.code = code;
	}
	public double salary() {
		return getSalary(); //go to public
	}

	public double getSalary() {// go for the read only
		return salary;
	}

	public void setSalary(double salary) { // go for the read and write only
		this.salary = salary;

	}
}
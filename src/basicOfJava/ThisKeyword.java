package basicOfJava;
class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {//int rollon=101; float fee=5000.0f;
		System.out.println("Local rollno: "+rollno); //101
		System.out.println("Local fee: "+fee);//5000.0
		rollno = rollno;
		fee = fee;
		System.out.println("Local rollno: "+rollno); //101
		System.out.println("Local fee: "+fee); //5000
	}
	void display() { //this method call the global variable
		System.out.println(rollno + " " +  fee);
	}
}
public class ThisKeyword {
	static int rollNum,res;;
	public static void main(String args[]) {
		Student s1 = new Student(101, 5000f);
		s1.display();//0 0.0
		Student s2 = new Student(102, 6000f);
		s2.display();//0 0.0
		int rollNum=65;
		System.out.println("access Local rollNum: "+rollNum);
		System.out.println("access global roolNum: "+ThisKeyword.rollNum);
		System.out.println("access global res: "+res);
		System.out.println("access global res: "+ThisKeyword.res);
	}
}
/**
 * this keyword:
 * 	- Its an instance of current class
 *  - its use to diffirenticate non-static global and local variable when they have same name // as well method
 *  - can be use to call non-static members of the class
 */

package basicOfJava;

class Student102 {
	int rollno;
	float fee;
	Student102(int rollno) {
		this.rollno = rollno;	 //111 chi value 111 jhali globally for 1 s1 object same for s2 object
	}
	Student102(int rollno, float fee) {
		this(rollno);
		this.fee = fee;		 
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement4 {
	public static void main(String args[]) {
		Student102 s1 = new Student102(111);
		Student102 s2 = new Student102(112, 6000f);
		s1.display();
		s2.display();
	}
}

// as per the statement if this keyword is used in the left
//side tht means local value is transfer to global mhanje pudh tujhi value local la hoti tich rahanar

//ani jr this word rigth side la use kela tr tujhi local chi value ji ahe tith global value 
//yte ani right side la aslayamul sagli kd global chi value rahanar pudh
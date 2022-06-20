package oops;

class Ae2 {
	void msg() {
		System.out.println("Hello");
	}
}
//class Be225 {
//	void msg() {
//		System.out.println("Welcome");
//	}
//}
class Inhertance4 extends Ae2 {
//	class Inhertance4 extends A2, B2 {
		
	Inhertance4(){
		super();//confusion for super 
		//super keyword is default in the class constructor while u calling multiple inheritance that 
		//sper statment get confuse so thats why java class doesnt support it and its ambiguity problem
	}

	public static void main(String args[]) {
		Inhertance4 obj = new Inhertance4();
		obj.msg();
	}
}
/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/
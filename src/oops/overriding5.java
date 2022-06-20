package oops;

//Base Class or parent class or Super class
class Parent1285 {
	public void show() {
		System.out.println("Parent's show()");
	}
}
//Inherited class or child class or sub class
class Child125 extends Parent1285 {
	// This method overrides show() of Parent
	@Override
	public void show() {
		System.out.println("Child's show()");
	}
}
//Driver class
public class overriding5 {
	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent1285 obj1 = new Parent1285();
		obj1.show();//Parent's show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent1285 obj2 = new Child125();
		obj2.show();//Child's show()
	}
}
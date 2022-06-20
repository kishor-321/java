package oops;

//final methods cannot be overridden
class Parent3 {
	// Can't be overridden
	public void show() { //if we are write here final keyword then progrm wil not execute
		System.out.println("I am final method of Parents class");
	}
}
class Child3 extends Parent3 {
	// This would produce error
	public void show() {
		System.out.println("I am show method of child3 class");
	}
}
//Driver class
public class overriding7 {
	public static void main(String[] args) {

	}
}
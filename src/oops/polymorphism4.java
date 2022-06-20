package oops;
class Ani1 {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Ani1 {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Ani1 {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Ani1 {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class polymorphism4 {
	public static void main(String args[]) {
		Ani1 A = new Ani1();
		A.eat();// Animals Eat
		Ani1 h = new herbivores(); // 
		h.eat();// 
		Ani1 o = new omnivores(); // 
		o.eat();// 
		Ani1 c = new carnivores(); // 
		c.eat();//
	}
}
/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */
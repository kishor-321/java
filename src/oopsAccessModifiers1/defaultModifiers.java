package oopsAccessModifiers1;

public class defaultModifiers {

	public static void main(String[] args) {
		
		defaultMembers p1=new defaultMembers();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

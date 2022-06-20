package oopsAccessModifiers1;

public class protectedMembers {

	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		protectedMembers p1=new protectedMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		protectedMembers p1=new protectedMembers();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

package oopsAccessModifiers1;

class protectedModifiers {

	public static void main(String[] args) {
		
		protectedMembers p1=new protectedMembers();
		System.out.println("Accessing Protected members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

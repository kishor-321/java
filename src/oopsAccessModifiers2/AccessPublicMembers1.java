package oopsAccessModifiers2;

import oopsAccessModifiers1.PublicMember;

public class AccessPublicMembers1 {

	public static void main(String[] args) {

		PublicMember p1 = new PublicMember();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

class Demo {

	public static void main(String[] args) {

		PublicMember p1 = new PublicMember();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

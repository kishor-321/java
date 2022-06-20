package oopsAccessModifiers2;

import oopsAccessModifiers1.defaultMembers;

public class accessDefaultMembers {

	public static void main(String[] args) {
		
		defaultMembers p1=new defaultMembers();
		System.out.println("Accessing default members from another class within same package");
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
	}

}
//can not accessible to the other package because having the default modifier in the defaultMember class
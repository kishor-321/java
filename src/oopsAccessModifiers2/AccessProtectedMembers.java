package oopsAccessModifiers2;

import oopsAccessModifiers1.protectedMembers;

class AccessProtectedMembers extends protectedMembers {

	public static void main(String[] args) {
		AccessProtectedMembers p1=new AccessProtectedMembers();//in the class of protrctedMembers have the sub class
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

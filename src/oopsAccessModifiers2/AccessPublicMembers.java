package oopsAccessModifiers2;

public class AccessPublicMembers {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		oopsAccessModifiers1.PublicMember p1=new oopsAccessModifiers1.PublicMember();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
	}
}

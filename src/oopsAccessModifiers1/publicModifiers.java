package oopsAccessModifiers1;

public class publicModifiers {

	public static void main(String[] args) {
		
		PublicMember p1=new PublicMember();
		System.out.println("Accessing Default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

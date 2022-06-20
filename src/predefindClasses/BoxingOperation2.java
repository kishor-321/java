package predefindClasses;

public class BoxingOperation2 {

	public static void main(String[] args) {

		char c1='A';

		Character charObj1=new Character(c1);// A
		System.out.println(c1==charObj1);// true
		Character charObj2=new Character('Z');// Explicitly boxing

		Character charObj3='H';// implicitly boxing

		System.out.println("c1: "+c1);// A
		System.out.println("charObj1: "+charObj1); // A
		System.out.println("charObj2: "+charObj2); // Z
		System.out.println("charObj3: "+charObj3); // H

		boolean b=true;//
		Boolean bObj=new Boolean(b);// Explicitly unboxing
		System.out.println(bObj==b); // true
	}
}

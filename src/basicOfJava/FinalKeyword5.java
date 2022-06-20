package basicOfJava;

public class FinalKeyword5 {


	final int speedlimit;// blank final variable
	FinalKeyword5() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword5 f1=new FinalKeyword5();
		System.out.println(f1.speedlimit); 
	}
}
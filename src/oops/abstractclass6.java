package oops;
abstract class RBIBank102 {
 abstract double getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}//The abstract method getRateOfInterestForHomeLoan in type RBIBank102 can only set a visibility modifier, one of public or protected
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class abstractclass6 {
	public static void main(String args[]) {		
	
	}
}
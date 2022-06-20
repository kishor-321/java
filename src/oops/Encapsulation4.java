package oops;
public class Encapsulation4 {
	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
	}
}



//package day28Encapsulation;
class Account {
	// private data members
	private long acc_no;
	private float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public float getAmount() {
		return amount;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}	
}

package oops;

class Cards {
	void run() {
		System.out.println("running");
	}
}
class innova extends Cards {
	void run()
	{
		System.out.println("running fast at 120km");
	}
}
public class Polymorphisnm5 {
	public static void main(String args[]) {
		Cards c = new innova();
		c.run();//
	}
}
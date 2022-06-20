package basicOfJava;
class DemoTest100 {
	static void display() {
		System.out.println("I am display() of DemoTest100");
	}
	void call() {
		System.out.println("Calling of DemoTest100");
	}
}
public class Methodoverloading2 {

	static void display() {
		System.out.println("I am display() of DemoTest");
	}
	void call() {
		System.out.println("Calling");
	}
	public static void main(String[] args) {
		Methodoverloading2.display();
		Methodoverloading2 d1=new Methodoverloading2();
		d1.call();
		DemoTest100.display();
		DemoTest100 d2=new DemoTest100();
		d2.call();
		
		Methodoverloading2.disp('A');
		Methodoverloading2 d3=new Methodoverloading2();
		d3.callMe();
	}
	public void callMe() { // here is return type is void because its call by creating object
		// TODO Auto-generated method stub
		System.out.println("calll method call me having default parameter");
	}
	static void disp(char c) { //here call static because its call by classname
		// TODO Auto-generated method stub
		System.out.println("call method dispaly having char parametr");
	}

}

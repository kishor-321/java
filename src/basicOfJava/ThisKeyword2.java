package basicOfJava;

public class ThisKeyword2 {
	int x;
	// Constructor with a parameter
	public ThisKeyword2(int x) { //int 45
		System.out.println("Local variable x: "+x); //45
		System.out.println("Global variable x: "+this.x) ; //0
		System.out.println("*******************************"); //
		//x = this.x;  // 45 = 0 means 45 = 0 where is this keyword is use tht means this value will be globbally 
		this.x = x; // 0 = 45 that means this word mean globally
		System.out.println("Local variable x: "+x); 
		System.out.println("Global variable x: "+this.x);
		System.out.println("********************************************");
		
	}
	// Call the constructor
	public static void main(String[] args) {
		ThisKeyword2 myObj = new ThisKeyword2(45);
		System.out.println("Value of x = " + myObj.x);//
	}
}

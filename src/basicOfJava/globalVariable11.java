package basicOfJava;

public class globalVariable11 {
	//Global Variable ---> static & non-static global variable
	static int rollNum=456;		//--->static global
	static boolean result;		//--->static global
	
	double payment=4500.56;		//--->non static global
	char grade;			//--->non static gloabl

	public static void main(String[] args) {

		System.out.println("Program starts..");       //program starts

		//access static & non-static global variable
	
		System.out.println("SGV rollNum: "+rollNum);	//sgv rollnum: 456
		System.out.println("SGV result: "+result);	//sgv result: false 
		
		globalVariable11 g1 = new globalVariable11();		//using for non static global variable
		System.out.println("NSGV payment: "+g1.payment);	//nsgv payment: 4500.56
		System.out.println("NSGV grade: "+g1.grade);		//nsgv grade: 

		//update the value of static & non-static global variable

		rollNum=500;
		result=true;
		g1.payment=54220.56;
		g1.grade='A';		

		//access the updated value of static & non-static global variable

		System.out.println("updated, SGV rollNum: "+rollNum);	// updated, sgv rollnum: 500
		System.out.println("updated, SGV result: "+result);	// updated, sgv result: true
		System.out.println("updated, NSGV payment: "+g1.payment);	// updated, nsgv payment: 54220.56
		System.out.println("updated, NSGV grade: "+g1.grade);		// updated, nsgv grade: A

		System.out.println("Program ends..");				// Program ends..
	}
}
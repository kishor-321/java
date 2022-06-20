package exceptionHandeling;

import java.util.Scanner;

public class Exceptiontype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i=15,j = 0,k;

		Scanner scn=new Scanner(System.in);
		try{
			System.out.println("Enter first num1: ");
				i=scn.nextInt();
			System.out.println("Enter first num2: ");
			j=scn.nextInt();
			k= i/j;//ArithmeticException
			System.out.println("res: "+k);
		}catch(ArithmeticException obj) {
			System.out.println("Exception handled"+obj);//java.lang.ArithmeticException: / by zero
			obj.printStackTrace();//complete exception detail
		}		
		System.out.println("Programs ends here...");
	}
}



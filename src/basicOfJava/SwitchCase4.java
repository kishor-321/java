package basicOfJava;

public class SwitchCase4 {

	public static void main(String args[]) {
		int num1 = 10, num2 = 5, res;
		char op = '+';

		switch (op) {

		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		
		SwitchCase4.cal();
		System.out.println("ends here...");
	}

	public static double cal() {
		// TODO Auto-generated method stub
		int num3=10 , num4 =5, rest=0;
		char ope ='-';
		switch (ope) {
		case '-':
			rest = num3 - num4;
			System.out.println("num3-num4=" + rest);
			return rest;
		case '+':
			rest = num3 + num4;
			System.out.println("num3+num4=" + rest);
			return rest;
		case '/':
			rest = num3 / num4;
			System.out.println("num3/num4=" + rest);
			return rest;
		default:
			System.out.println("Unknown operation");
			return rest;
		}

	}

}



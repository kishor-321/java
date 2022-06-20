package predefindClasses;

import java.util.Scanner;

public class systemClass {

	public static void main(String[] args) {
		System.out.println("Calling user home admin "+System.getProperty("user.home"));
		System.out.println("Calling user folder direction path ="+System.getProperty("user.dir"));
		System.clearProperty("user.home");
		System.out.println("CAlling the home admin with zero or null admin ="+System.getProperty("user.home"));
		System.setProperty("user.country","indian");
		System.out.println(System.getProperty("user.country"));
		//		System.exit(0);
		//		System.exit(1);
		//		System.exit(-1);
		System.out.println("calling the other system "+System.getProperty("user.password","Non of urs business"));
		System.out.println("System.currentTimeMillis() ="+System.currentTimeMillis());
		System.out.println("System.nanoTime()="+System.nanoTime());
		System.clearProperty("user.home");
		System.out.println("Calling the othre pathe of system ="+System.setProperty("user.home","D:\\Downloads"));
		System.out.println("Calling the user home updated ="+System.getProperty("user.home"));
		//		System.exit(0);// end of Programm / terminate

		Scanner in = new Scanner (System.in);
		int age;
		double salary;
		boolean valid;
		System.out.println("Enter ur age ");
		age = in.nextInt();
		System.out.println("enter ur salary");
		salary = in.nextDouble();
		System.out.println("enter validity ");
		valid =in.nextBoolean();
		System.out.println("age is ="+age);
		System.out.println("salary is ="+salary);
		System.out.println("ur valid or not ="+valid);
		in.close();

		String s = "i am from pune";
		Scanner scan = new Scanner (s);
		System.out.println("Boolean reault is  ="+scan.hasNext());
		System.out.println("String is ="+scan.nextLine());
		scan.close();


		Scanner pune = new Scanner(System.in);
		System.out.println("Calling name");
		String name = pune.next();
		System.out.println("CAlling int value");
		int avg= pune.nextInt();
		System.out.println("Calling double");
		double decimal = pune.nextDouble();
		System.out.println(name);
		System.out.println(avg);
		System.out.println(decimal);
		pune.close();
	}

}

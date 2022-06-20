package basicOfJava;

public class IfCondition3 {
	public static void main(String[] args) {
		int year = 2021;
		if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}

		System.out.println("Given year is leap year or not 2022 is leap or not: " + checkLeapYear(2022));
		System.out.println("Given year is leap year or not: " + checkLeapYear(2010));
	}
	static boolean checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			 System.out.println("LEAP YEAR");
			return true;
		} else {
			 System.out.println("COMMON YEAR or NON LEAP YEAR");
			return false;
		}
	}
	
}
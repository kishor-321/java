package basicOfJava;


public class ThisStatment {
	ThisStatment(){
		System.out.println("I am zero-param");
	}
	ThisStatment(int num){
		this(45l);
		System.out.println("I am int-param"); //3
		System.out.println(num);
	}
	ThisStatment(double num){
		this(25);
		System.out.println("I am double-param"); //4
		System.out.println(num);
	}
	ThisStatment(long num){
		this('a');
		System.out.println("I am long-param"); //2
		System.out.println(num);
	}
	ThisStatment(char num){
		System.out.println("I am char-param"); //1
		System.out.println(num);
	}
	public static void main(String[] args) {
		ThisStatment t1=new ThisStatment(25.6);
	}
}
//char-->long-->int-->double
//execution in reverse format one by one
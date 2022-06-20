package predefindClasses;

public class UnboxingOperation {


	public static void main(String[] args) {
	
		Double doubleObj=25.2566;//autoboxing 
		System.out.println("doubleObj: "+doubleObj);// 25.2566
		//only boxed object can be unboxed
		double salary=doubleObj.doubleValue();//unboxing 
		System.out.println(salary); //25.2566
		System.out.println(doubleObj==salary);// true
		
		Boolean b=true;//boxing
		boolean b1=b.booleanValue();//unboxing
		
		Character c1=new Character('a');//boxing
		char c2=c1.charValue();//unboxing
		
		Integer i=25;
		double d=i.intValue();
	}
}

package predefindClasses;

public class wrapperClass {

	public static void main(String[] args) {
		int a=20;  
		//Converting int into Integer  
		Integer k=new Integer(a);//converting int into Integer explicitly
		Integer l=new Integer(20);//converting int into Integer explicitly
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);  //20	 /20 	/20 	/ 20	ans on new line
		System.out.println("***Unboxing of boxed object*****");
		//Converting Integer to int     
		Integer a1=new Integer(3);   
		int i1=a1.intValue();//converting Integer to int explicitly  
		System.out.println("a1: "+a1+"\ni1: "+i1); 
		
		System.out.println("a1==i1 : "+(a1==i1)); 
		System.out.println("a1.equals(i1) : "+a1.equals(i1)); // boolean ans will be same as above object cpmparison based on there values
	}

}

/**
 * Wrapper class is a predefined class in java belongs to java.lang package
 * its used to convert primitive type to object type 
 * 			-----> boxing operation ---> implicitly or auto-boxing
 * converting back the boxed object into primitive type is known as 
 * 			-----> un-boxing operation ---> 
 * 
 * in wrapper class toString() & equlas & '==' are overrided
 * 
 * 
 * 
 */ 

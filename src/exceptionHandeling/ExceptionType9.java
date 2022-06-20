package exceptionHandeling;

public class ExceptionType9 {

	public static void validateAge(int age) {
		// TODO Auto-generated method stub
		  if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	    	try {
	    		validateAge(17);
	    	}catch(ArithmeticException e) {
	    		System.out.println("Exception handled...");
	    		System.out.println(e);
	    	}
	        System.out.println("rest of the code...");  
	}

}

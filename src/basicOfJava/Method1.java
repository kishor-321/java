package basicOfJava;

public class Method1 {

	/*
private	 * accessmodifier: 		
static	 * non-accessmodifier:	
id* return type:			
getEmpName	 * methodName:			
int id	 * argument/parameter:	
id * return value:		
	 */
	private static int getEmpName(int id) {
		//statements
		return id;
	}
	
	
	
	
	/*
public * accessmodifier: 
static	* non-accessmodifier:	
int	 * return type:		
getEmpContact	 * methodName:		
short id	 * argument/parameter:	
id	 * return value:	
	 */
	public static int getEmpContact(short id) {
		//statements
		return id;
	}
	
	
	
	/*
	default * accessmodifier:	
	static * non-accessmodifier:	
	double * return type:		
	getEmpPPin * methodName: 		
	Long id * argument/parameter:	 
	return id * return value:	
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	
	
	
	
	/*
default	 * accessmodifier:	 
	static * non-accessmodifier:	 
	int * return type:		 
	getEmpAccount * methodName:		
	empty * argument/parameter: 	
	25 * return value:	
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	
	
	
	/*
	Public * accessmodifier:	
	default * non-accessmodifier:	
	void * return type:		
	main * methodName:		
	 string[] args * argument/parameter: 	
	 zero * return value:	
	 */
	public void main(String[] args) {
		
		//return;//by default written by java compiler at the time of compilation
	}
	
	
	
	
	
	/*
	default * accessmodifier:	 
	default * non-accessmodifier:	
	void * return type:		
	addTwoNumbers * methodName:		
	empty * argument/parameter:
	res * return value:	
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	
	
	
	/*
	private * accessmodifier:	
	default * non-accessmodifier:
	double * return type:		
	addTwoNumbers * methodName:		
	int num1 and int num2 * argument/parameter:
	int res * return value:	
	 */
	private double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
/*
	 * accessmodifier:	 
	 * non-accessmodifier:
	 * return type:		
	 * methodName:		
	 * argument/parameter:
	 * return value:	
*/
	}
}

package basicOfJava;
/**
 * what if return type, method name and argument list same.
 */
public class MethodOverLoading11
{
   public int myMethod(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public double myMethod(int var1, double var2)
   {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
   }

   public static void main(String args[])
   {
	   MethodOverLoading11 obj1= new MethodOverLoading11();
       obj1.myMethod(10,10);
       obj1.myMethod(20,12.5);
   }
}

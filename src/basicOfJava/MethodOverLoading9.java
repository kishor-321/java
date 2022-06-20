package basicOfJava;
/**
 * Question 2 – return type is different. Method name & argument list same.
 */
public class MethodOverLoading9
{
   public double myMethod(int num1, int num2)
   {
      System.out.println("First myMethod of class Demo");
      return num1+num2;
   }
   public int myMethod1(int var1, int var2)
   {
      System.out.println("Second myMethod of class Demo");
      return var1-var2;
   }
   public static void main(String args[])
   {
	   MethodOverLoading9 obj2= new MethodOverLoading9();
      obj2.myMethod(10,10); //method overloading is not depend on return type
      obj2.myMethod(20,12); // confuse because having two method same parameter method overloading not success
   }
}
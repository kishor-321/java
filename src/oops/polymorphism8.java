package oops;

class Bik {
	int speedlimit = 90;
	
}
class Honda3 extends Bik {
	int speedlimit = 150;
}
public class polymorphism8{
	public static void main(String args[]){  
	  Bik obj=new Honda3();
	  System.out.println(obj.speedlimit);
	}
}

//remember the varibale is different and method is different in have working
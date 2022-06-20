package predefindClasses;
class System1 {
	System1() {
		System.out.println("Im constructor in system1 class");
	}
	public static void mark () {
		System.out.println("Im from method in system1 class");
	}
	public void mrt (int l) {
		System.out.println("calling integer value from main method ="+l);
	}
}
public class SystemClassObject {

		static System1 t5 =new System1();

	public static void main(String[] args) {
		
		SystemClassObject.t5.mark(); //creating object in main class
		SystemClassObject.t5.mrt(15);
		
		
		System1 r5=new System1();//creating object here
		r5.mark();
		r5.mrt(85);
		
	}

}

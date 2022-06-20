package oops;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class CastingPrimitives13 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}

	public static void main(String[] args) {

		CastingPrimitives13 u1=new CastingPrimitives13();
		Mumbai m1=new CastingPrimitives13();//auto upcasting or implicit upcasting
		Mumbai m2=u1;//auto upcasting or implicit upcasting
		Pune p1=new CastingPrimitives13();//auto upcasting or implicit upcasting
		Pune p2=u1;//auto upcasting or implicit upcasting

		Mumbai m3=(Mumbai)new CastingPrimitives13();//explicit upcasting
		Mumbai m4=(Mumbai)u1;//explicit upcasting
		Pune p3=(Pune) new CastingPrimitives13();//explicit upcasting
		Pune p4=(Pune)u1;//explicit upcasting


		Pune p5=new Mumbai();//implicit upcasting
		Pune p6=(Pune)new Mumbai();//explicit upcasting
	}

}

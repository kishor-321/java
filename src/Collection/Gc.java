package Collection;

public class Gc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gc g1=new Gc();
		System.out.println("Object representation of GC: "+g1);
		System.out.println("Address of GC: "+g1.hashCode());
		g1=null;
		System.gc();
	}
	@Override
	protected void finalize() {
		System.out.println("Hi, I am finalize method..");
	}
}

/**
why finalize: release system resources before the garbage collector runs for specific object

 */
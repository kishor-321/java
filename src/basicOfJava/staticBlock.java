package basicOfJava;

public class staticBlock {
static {
	System.out.println("static blocjk");
}
public static void main(String[] args) {
	System.out.println("i m ");
	staticBlock p1 = new staticBlock();
}
{
	System.out.println("call non static block");
}
}

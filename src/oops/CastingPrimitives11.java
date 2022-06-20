package oops;
class Sampl
{
    void test1(double d)//
    {
        System.out.println("d value="+d);
    }
//    void test1(int k)
//    {
//        System.out.println("k value="+k);
//    }
}
public class CastingPrimitives11 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sampl s=new Sampl();
        s.test1(7);
        System.out.println("Program ends");         
    }
}
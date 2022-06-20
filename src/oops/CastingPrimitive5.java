package oops;
class Sample
{
    void test(double d)// infact we write double d=7.0d so its a implicit casting
    {
        System.out.println("d value="+d);
    }
    void test1(int k) //infact we write int k=7 so its a implicit casting
    {
        System.out.println("k value="+k);
    }
}
public class CastingPrimitive5 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample s=new Sample();
        s.test(7.0d);
        s.test1(7);
        System.out.println("Program ends");         
    }
}
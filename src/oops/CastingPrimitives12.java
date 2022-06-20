package oops;
class Sample125
{
    double test1()
    {
        System.out.println("Running test1");
        return 4;//
    }     
}
public class CastingPrimitives12 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample125 s=new Sample125();
        int res=(int)s.test1();//
        System.out.println("raturn value="+res);
        System.out.println("Program ends");
         
    }
}
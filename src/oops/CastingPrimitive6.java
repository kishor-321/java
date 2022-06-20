package oops;
class Sample1
{
    double test1()
    {
        System.out.println("Running test1");
    
        return 4;// implicit if we remove the 4 then it will not run so that may be implicit
    }     
}
public class CastingPrimitive6 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample1 s=new Sample1();
        int res=(int)s.test1();// explicit widing because here is the int is bigger inside res is that method called
        System.out.println("raturn value="+res);
        System.out.println("Program ends");
         
    }
}//upper side is must bigger then there and bottom side is closer like narrow pant fashion that is narrowing
// and widening is just oppose of narrowing
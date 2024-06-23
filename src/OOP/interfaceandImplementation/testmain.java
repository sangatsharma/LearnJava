package OOP.interfaceandImplementation;
import java.lang.reflect.Method;
/**
 * testmain
 */
public interface testmain {

    void sum(int a,int b);
}
class GFG
{
    public static void main (String[] args)
    {
        testmain obj=(int a,int b)->System.out.println(a+b);

        // sample ob1 = new sample();
        obj.sum(10, 20);
        // // calling the method implemented
        // // within the class.
        // ob1.m1();
        // ob1.m2();
        // Class cls=ob1.getClass();
        // System.out.println("class name :"+cls.getName());

    }
}
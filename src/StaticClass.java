
public class StaticClass {
    static int a = 10, b = 20;
    int c=102;

    static void method(int x) {
        System.out.println("x= " + x);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
    
    static {
        System.out.println("static block initialized ");
        b = a * 4;
    }
    public static void main(String[] args) {
        method(100);
        int[] roll=new int[10];
        int roll2[]=new int[9];
        int []roll1={1,2,3};
        System.out.println(roll.length +" "+ roll1.length +" "+ roll2.length);

    }
}

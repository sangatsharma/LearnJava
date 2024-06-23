import java.util.Random;
public class RandomGenerator {
    public static void main(String[] args){
        Random rand=new Random();
        double x=rand.nextDouble(100); //limit in constructor starting from 0 to 99
        System.out.println(x);

    }
}

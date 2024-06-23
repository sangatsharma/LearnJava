 package OOP;

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // Car myCar = new Car();
//         // System.out.println(myCar.carName);
//         // System.out.println(myCar.color);
//         // System.out.println(myCar.numberPlate);
//         // myCar.drive();
//         // myCar.brake();
//         int []arr = new int[10];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter 10 numbers");
//         for (int i = 0; i < 10; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int evenarray[] = new int[10];
//         int oddarray[] = new int[10];
//         for(int i=0;i<10;i++){
//             evenarray[i]=-1;
//             oddarray[i]=-1;
//         }
//         int j = 0, k = 0;
//         for (int i = 0; i < 10; i++) {
//             if (arr[i] % 2 == 0) {
//                 evenarray[j++] = arr[i];
//             } else {
//                 oddarray[k++] = arr[i];
//             }
//         }
//         System.out.println("even numbers: ");
//         for (int i = 0; i < 10; i++) {
//             if(evenarray[i]!=-1)
//             System.out.println(evenarray[i]+" ");
//         }
//         System.out.println("odd numbers: ");
//         for (int i = 0; i < 10; i++) {
//             if(oddarray[i]!=-1)
//             System.out.println(oddarray[i]+ " ");
//         }
//         sc.close();

//     }
// }
abstract class Person {
    abstract void eat();
}

class Main {
        public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
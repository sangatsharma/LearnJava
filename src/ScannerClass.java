import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=sc.nextLine();
        System.out.println("My name is "+name);
        System.out.print("enter your age : ");
        int age=sc.nextInt();
        System.out.println("My name is "+age);
        System.out.println("enter your food : ");
        sc.nextLine();
        String food=sc.nextLine();
        System.out.println("My food is "+food);     
        sc.close();
        System.out.println("Scanner closed");     
    }
}

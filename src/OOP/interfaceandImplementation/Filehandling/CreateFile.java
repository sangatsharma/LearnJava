package OOP.interfaceandImplementation.Filehandling;

import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream F = new FileOutputStream(
                "C://Users//97798//Desktop//Java//LearnJava//src//OOP//interfaceandImplementation//Filehandling//test.jsp");
                byte []data={10,111,110};
        F.write(data);
        F.close();
        FileInputStream in=new FileInputStream("C://Users//97798//Desktop//Java//LearnJava//src//OOP//interfaceandImplementation//Filehandling//test.jsp");
        int i;
        for( i=0;i<in.available();i++){
            System.out.println((char)in.read());
        }

    
    }
}

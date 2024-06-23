package OOP.Networking;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 4000);
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        s.getInputStream()));
        String text = "";
        while (true) {
            if (!text.equalsIgnoreCase("exit")) {
                System.out.println("Enter number to ask server reply:");
                text = sc.nextLine();
                ps.println(text);

                String str;
                str = br.readLine();
                System.out.println(str);
            } else {
                sc.close();
                s.close();
                System.exit(0);
            }
        }
    }
}

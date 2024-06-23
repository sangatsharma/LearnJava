package OOP.Networking;

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();
        System.out.println("client connected");
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = null;
        int str1;
        while (true) {
            str = br.readLine();
            if (!str.equalsIgnoreCase("exit")) {
                str1 = Integer.parseInt(str);
                ps.println((str1 * str1));
            } else {
                ps.println("Disconnected from server");
                s.close();
                ss.close();
                System.out.println("server close");
                System.exit(0);
            }
        }

    }
}

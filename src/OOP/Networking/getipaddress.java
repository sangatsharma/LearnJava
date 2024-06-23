package OOP.Networking;
import java.net.*;
public class getipaddress {
    public static void main(String[] args) throws Exception {
        InetAddress ip=InetAddress.getByName("www.sangatsharma.com.np");
        System.out.println("host name: "+ip.getHostName());
        System.out.println("ip name: "+ip.getHostAddress());
    }
}

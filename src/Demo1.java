import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Demo1
 * @Date: 2023/03/29/13:16
 * @Author: 李鹏程
 * @Description:
 */
public class Demo1 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.137.1");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);
    }

}

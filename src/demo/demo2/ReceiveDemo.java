package demo.demo2;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: ReceiveDemo
 * @Date: 2023/03/29/14:52
 * @Author: 李鹏程
 * @Description:
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);

        InetAddress address = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(address);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        ms.receive(dp);

        byte[] data = dp.getData();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        System.out.println("ip:"+ip);
        System.out.println("主机名:"+name);
        System.out.println("消息:"+new String(data,0,data.length));

        ms.close();

    }
}

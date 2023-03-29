package demo.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: ReceiveDemo1
 * @Date: 2023/03/29/15:03
 * @Author: 李鹏程
 * @Description:
 */
public class ReceiveDemo1 {
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
        System.out.println("主机名:"+new String(data,0,data.length));
        System.out.println("消息:"+data);

        ms.close();
    }
}

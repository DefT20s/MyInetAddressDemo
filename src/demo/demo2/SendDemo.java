package demo.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: SendDemo
 * @Date: 2023/03/29/14:51
 * @Author: 李鹏程
 * @Description:组播发送
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();
        String s = "你好，你好！";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.2");
        int port = 10000;

        DatagramPacket ds = new DatagramPacket(bytes,bytes.length,address,port);

        ms.send(ds);

        ms.close();
    }
}

package work;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: ReceiveWork
 * @Date: 2023/03/29/14:20
 * @Author: 李鹏程
 * @Description:
 */
public class ReceiveWork {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = data.length;
            String ip = dp.getAddress().getHostName();
            String name = dp.getAddress().getHostName();

            System.out.println("ip:"+ip);
            System.out.println("主机名:"+name);
            System.out.println("消息:"+new String(data,0,len));
        }
    }
}

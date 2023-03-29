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
        DatagramSocket ds = new DatagramSocket();//随机端口

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你要说的话：");
            String str = sc.nextLine();
            if (str.equals("886"))break;
            byte[] bytes =  str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
        }

        ds.close();
    }
}

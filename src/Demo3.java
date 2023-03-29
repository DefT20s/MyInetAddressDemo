import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Demo3
 * @Date: 2023/03/29/14:05
 * @Author: 李鹏程
 * @Description:UDP接收数据
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //绑定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        //解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("数据："+new String(data,0,len)+"IP："+address+"端口："+port);

        ds.close();
    }
}

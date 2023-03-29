import java.io.IOException;
import java.net.*;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Demo2
 * @Date: 2023/03/29/13:51
 * @Author: 李鹏程
 * @Description:DUP发送和接收数据
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {


        //1.创建DatagramSocket对象
        //绑定端口
        //空参：所有可用端口随机一个使用
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        String str = "hello world !";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();
    }
}

package work.work3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Client
 * @Date: 2023/03/29/15:52
 * @Author: 李鹏程
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        String s = "加油！";
        //发送消息
        OutputStream os = socket.getOutputStream();
        os.write(s.getBytes());

        socket.shutdownOutput();//结束标志

        //接收回复
        InputStreamReader lsr = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b=lsr.read())!=-1){
            System.out.print((char)b);
        }
        socket.close();
    }
}

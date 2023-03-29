package work.work3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Server
 * @Date: 2023/03/29/15:52
 * @Author: 李鹏程
 * @Description:
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        //接收消息
        Socket socket = ss.accept();

       InputStreamReader isr = new InputStreamReader(socket.getInputStream());
       int b;
       while ((b=isr.read())!=-1){
           System.out.print((char)b);
       }

       //消息回复
        String str = "加油";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

       socket.close();
       ss.close();//关闭服务器

    }
}

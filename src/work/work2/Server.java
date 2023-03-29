package work.work2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Server
 * @Date: 2023/03/29/15:39
 * @Author: 李鹏程
 * @Description:
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;

        while ((b=isr.read())!=-1){
            System.out.println((char)b);
        }

        socket.close();
        isr.close();



    }
}

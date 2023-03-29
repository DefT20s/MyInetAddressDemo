package demo.demo3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Server
 * @Date: 2023/03/29/15:13
 * @Author: 李鹏程
 * @Description:
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read())!=-1){
            System.out.println((char) b);
        }

        socket.close();
        ss.close();
    }
}

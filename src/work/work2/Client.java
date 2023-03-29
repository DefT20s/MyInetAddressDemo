package work.work2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Client
 * @Date: 2023/03/29/15:39
 * @Author: 李鹏程
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入消息内容：");
            String s = sc.nextLine();
            if ("886".equals(s))break;
            os.write(s.getBytes());
        }

        // os.close();
        socket.close();
    }
}

package demo.demo3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: Cilent
 * @Date: 2023/03/29/15:13
 * @Author: 李鹏程
 * @Description:TCP
 */
public class Cilent {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

        os.close();
        socket.close();
    }
}

package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TimeClient {
    public static void main(String[] args) {

        Socket socket = null;

        try {
            socket = new Socket();   // Server와 통신하기 위한 Socket
            socket.connect(new InetSocketAddress("localhost", 10002));
            System.out.println("[Server 접속 Success]");

            byte[] bytes = null;
            String message = null;

            // Socket에서 가져온 출력스트림
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            // send bytes
            message = "클라이언트에서 보내는 데이터";
            bytes = message.getBytes("UTF-8");

            dos.writeInt(bytes.length);
            dos.write(bytes, 0, bytes.length);
            dos.flush();

            System.out.println("[Data Send Success] " + message);

            // Socket에서 가져온 입력스트림
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            // read int
            int receiveLengh = dis.readInt();

            // receive bytes
            if (receiveLengh > 0) {
                byte receiveByte[] = new byte[receiveLengh];
                dis.readFully(receiveByte, 0, receiveLengh);

                message = new String(receiveByte);
                System.out.println("[Data Receive Success] " + message);
            }

            // OutputStream, InputStream close
            os.close();
            is.close();

            // Socket 종료
            socket.close();
            System.out.println("[Socket closed]");

        } catch (Exception e) {
            e.printStackTrace();
        }

        if(!socket.isClosed()) {
            try {
                socket.close();
                System.out.println("[Socket closed]");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
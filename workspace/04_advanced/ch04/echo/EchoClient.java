package ch04.echo;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    void main(String[] args) {
        startClient();
    }
    void startClient(){
        try (   Socket s = new Socket("localhost",50000);
                InputStream in = s.getInputStream();
                OutputStream out = s.getOutputStream()
                ){
            System.out.println("서버에 연결되었습니다. 글자를 입력하고 엔터를 누르세요.");
            InputStream keyboard = System.in;

            int readData = 0;
            while ((readData = keyboard.read()) != -1){
                out.write(readData);
                int echoData = in.read();
                System.out.write(echoData);
            }

        } catch (IOException e) {
            System.err.println("네트워크 오류 발생 : " + e.getMessage());
        }
    }
}

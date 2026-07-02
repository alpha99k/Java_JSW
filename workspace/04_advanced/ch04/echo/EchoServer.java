package ch04.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    void startServer(){
        try(
                // 서버소켓 생성
                ServerSocket ss = new ServerSocket(8080);
        ){
            System.out.println("서버 소켓 생성 완료");
            // 클라이언트의 접속 대기
            Socket s = ss.accept(); // 블로킹 작업
            System.out.println("클라이언트 접속 : " + s.getInetAddress().getHostAddress());

            // 클라이언트의 메세지를 수신하는 INPUT스트림 생성
            InputStream in = s.getInputStream();

            // 클라이언트의 메세지를 송신하는 OUTPUT스트림 생성
            OutputStream out = s.getOutputStream();
            int readData = 0;
            while ( (readData = in.read()) != -1){
                // 표준 출력 장치로 1byte 출력
                System.out.write(readData); //클라이언트의 메세지 서버에 출력
                out.write(readData); //클라이언트의 메세지 반송
            }


        } catch (IOException e) {
            System.err.println("네트워크 오류 :" + e.getMessage());
        }

    }

    void main(){
        startServer();
    }
}

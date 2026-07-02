package ch03;


import java.io.IOException;

// 1. 표준입력장치(키보드) -> 표준출력장치(콘솔)
public class KeyboardToConsole {
    void main(String[] args) {
        try {
            // 표준 입력 장치로 부터 1byte 읽어온다.
            int readData = System.in.read();
            while ( (readData = System.in.read()) != -1){
                // 표준 출력 장치로 1byte 출력
                System.out.write(readData);
            }

        } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }
    }
}

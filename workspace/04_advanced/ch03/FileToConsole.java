package ch03;


import java.io.*;

// 3. 파일(output.txt) -> 표준출력장치(콘솔)
public class FileToConsole {
    void main(String[] args) {
        try (
                InputStream fis = new FileInputStream("output.txt")
                ){
                // 표준 입력 장치로 부터 1byte 읽어온다.
                int readData = 0;
                while ( (readData = fis.read()) != -1){
                  // 표준 출력 장치로 1byte 출력
                     System.out.write(readData);
                }
            } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }
    }
}

package ch03;

import java.io.*;

// 4. 파일(output.txt) -> 파일(output-copy.txt)
public class FileToFile {
    void main(String[] args) {
        try (
                InputStream fis = new FileInputStream("output.txt");
                OutputStream fos = new FileOutputStream("output-copy.txt")
        ){
            // 표준 입력 장치로 부터 1byte 읽어온다.
            int readData = 0;
            while ( (readData = fis.read()) != -1){
                // 표준 출력 장치로 1byte 출력
                System.out.write(readData);
                fos.write(readData);
            }
        } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }
    }
}

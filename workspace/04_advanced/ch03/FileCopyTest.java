package ch03;

import java.io.*;

// 4. 파일(output.txt) -> 파일(output-copy.txt)
public class FileCopyTest {
    void main(String[] args) {
        long start = System.currentTimeMillis();
        copyFileCustomBuffer("lib/mysql-connector-j-9.7.0.jar", "mysql-connector-j-9.7.0.jar");
//        copyFileCustomBuffer("output.txt", "output-copy.txt");
        long end = System.currentTimeMillis();

        System.out.println("소요시간 : " + (end-start) + "ms");
    }

    /**
     * 1차 스트림(FileInpustStream, FileOutputStream)을 이용해서 파일을 복사한다.
     * @param org   원본 파일명
     * @param dest  복사본 파일명
     */
    void copyFile(String org, String dest){
        try (
                InputStream fis = new FileInputStream(org);
                OutputStream fos = new FileOutputStream(dest)
        ){
            // 표준 입력 장치로 부터 1byte 읽어온다.
            int readData = 0;
            while ( (readData = fis.read()) != -1){
                // 표준 출력 장치로 1byte 출력
                fos.write(readData);
            }
        } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }

    }

    /**
     * 2차 스트림(BufferedInpustStream, BufferedOutputStream)을 이용해서 파일을 복사한다.
     * @param org   원본 파일명
     * @param dest  복사본 파일명
     */
    void copyFileUseBuffer(String org, String dest){
        try (
                InputStream bis = new BufferedInputStream( new FileInputStream(org));
                OutputStream bos = new BufferedOutputStream( new FileOutputStream(dest))
        ){
            // 표준 입력 장치로 부터 1byte 읽어온다.
            int readData = 0;
            while ( (readData = bis.read()) != -1){
                // 표준 출력 장치로 1byte 출력
                bos.write(readData);
            }
        } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }

    }

    /**
     * 커스텀 버퍼드 스트림
     * @param org
     * @param dest
     */
    void copyFileCustomBuffer(String org, String dest){
        try (
                InputStream fis = new FileInputStream(org);
                OutputStream fos = new FileOutputStream(dest)
        ){
            // 표준 입력 장치로 부터 1byte 읽어온다.
            byte[] buffer = new byte[1024 * 8]; // 8kb의 버퍼 생성
            int readsize = 0;
            while ( (readsize = fis.read()) != -1){
                fos.write(buffer, 0, readsize);
            }
        } catch (IOException e) {
            throw new RuntimeException("입출력 예외 발생 : " + e.getMessage());
        }

    }
}

package ch07;

import java.sql.Connection;

public class PerformanceTest {
    static void main(String[] args) {

        ConnectionPoolTest.findAll();

        System.out.println("첫번째 테스트 시작");
        long start1 = System.currentTimeMillis();
        for(int i = 1; i<=10; i++) {
            JdbxPostPreparedTest.insert(2, "커넥션 풀 사용안함 -" + i, "내용");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("커넥션 풀 없을 때 소요 시간 : " + (end1 - start1) + " ms");
        System.out.println("첫번째 테스트 종료");

        System.out.println("두번째 테스트 시작");
        long start2 = System.currentTimeMillis();
        for(int i = 1; i<=10; i++) {
            ConnectionPoolTest.insert(2, "커넥션 풀 사용 -" + i, "내용");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("커넥션 풀 있을 때 소요 시간 : " + (end2 - start2) + " ms");
        System.out.println("두번째 테스트 종료");

    }
}

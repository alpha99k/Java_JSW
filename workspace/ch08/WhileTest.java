package ch08;

import javax.swing.*;

// 1부터 지정한 수까지의 합계릘 구하시오.
public class WhileTest {
    static void main(String[] args) {
        //명령행 매개변수
        //java ch08.WhileTest "10" "20"
        // args[0] -> 10
        // args[1] -> 20
        int num = Integer.parseInt(args[0]); //String을 int로 변환
        int i = 1;
        int sum = 0;

        while (i <= num){
            sum += i;
            i++;
        }

        System.out.println(num + "   " + sum);
    }
}

package ch09;

import java.util.Scanner;

// 구구단 출력 ( 결과를 배열로 저장후 출력 )
public class ArrayForTest {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내옴
        int[] result = new int[100];

        for(int i = 0; i <= result.length-1; i++){
            result[i] = (i)*dan;
        }

        System.out.println(dan  + "단 학습 완료");

        for (int num = 1; num > 0;) {
            System.out.println(" *** ");
            num = s.nextInt();
            if(num == 0){
                break;}
            System.out.println(dan + " * " + num + " = " + (result[num]));
        }

        
    }
}

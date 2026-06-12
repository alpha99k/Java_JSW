package ch08;

import java.util.Scanner;

public class ForTest_4 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내옴
        System.out.println("--------------"+dan+"단"+"--------------");

        for(int i = 1; i <= 9; i++){
            System.out.println("          "+dan+ " * " + i + " = " + (i*dan));
        }
        System.out.println("--------------------------------");
    }
}

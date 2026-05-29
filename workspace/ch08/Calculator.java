package ch08;

import java.util.Scanner;

//계산기
    //
public class Calculator {
    static void main(String[] args) {
        System.out.println("**** 계산기 프로그램 ****");
        System.out.println("계산식을 입력하세요...(예시 : 5 + 4)");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        String operator = s.next();
        int num2 = s.nextInt();


        String result = switch (operator){
            case "+" -> "" + (num1 + num2);
            case "-" -> "" + (num1 - num2);
            case "*" -> "" + (num1 * num2);
            case "/" -> "" + ((double)num1 / num2);
            default -> "Wrong Input";
        };

        System.out.println(result);
    }
}

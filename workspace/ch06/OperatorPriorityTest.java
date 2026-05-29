package ch06;

public class OperatorPriorityTest{
    static void main(String[] args) {

//        1. 산술 연산자 우선순위 : 곱셉이 덧셈보다 우선함
        int result1 = 5 + 3 * 2;
        System.out.println("result1: (5 + 3 * 2) = " + result1);

//        !.괄호를 사용하면 우선순위를 1순위로 올린다.
        int result2 = (5 + 3) * 2;
        System.out.println("result2: ((5 + 3) * 2) = " + result2);

//        2. 비교 연산자와 논리 연산자 우선 순위 : 비교 연산이 논리 연산보다 우선함
        boolean result3 = (10 > 5) && (3 < 1);     // true && false = false
        System.out.println("result3: (10 > 5 && 3 < 1) = " + result3);
    }
}

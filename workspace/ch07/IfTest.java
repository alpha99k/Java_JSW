package ch07;

public class IfTest {
    static void main(String[] args) {
        int num = 70;
        int score = 95;


        if (score >= 90) {
            System.out.println("우수한 성적입니다."); // score가 95이므로 실행됨
        }
        score -= 10;
        if (score >= 90) {
            System.out.println("우수한 성적입니다."); // score가 85이므로 실행되지 않음
        }


        if( num%3 == 0 ){
            System.out.println(num + "은 3의 배수입니다.");   //조건이 참일때 동작
        } else if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        } else {
            System.out.println(num + "은 홀수입니다.");
        }





    }
}

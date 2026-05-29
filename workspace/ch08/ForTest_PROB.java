package ch08;

public class ForTest_PROB {
    static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // 1 - 100 까지 합계
        for(int i = 0; i <= 100; i++){
            sum1 += i;
        }
        System.out.println("1부터 100까지의 합계 : " + sum1);
        // 1 - 100 홀수 합계
        for(int i = 1; i <= 100; i += 2){
            sum2 += i;
        }
        System.out.println("1부터 100까지 홀수의 합계 : " + sum2);
        // 1 - 100 짝수 합계
        for(int i = 0; i <= 100; i += 2){
            sum3 += i;
        }
        System.out.println("1부터 100까지 짝수의 합계 : " + sum3);
    }
}

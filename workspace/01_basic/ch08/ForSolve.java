package ch08;

public class ForSolve {
    public static void main(String[] args){
        int sum = 0;

        // 1~100 합계
        for(int i=1; i<=100; i++){ // i: 1, 2, 3, 4, 5...
            sum += i;
        }
        System.out.println("1~100 합계: " + sum);

        // 1~100 홀수 합계
        sum = 0;
        for(int i=1; i<=100; i+=2){ // i: 1, 3, 5, 7...
            sum += i;
        }
        System.out.println("1~100 홀수 합계: " + sum);

        sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("1~100 홀수 합계: " + sum);

        // 1~100 짝수 합계
        sum = 0;
        for(int i=2; i<=100; i+=2){ // i: 2, 4, 6, 8, 10...
            sum += i;
        }
        System.out.println("1~100 홀수 합계: " + sum);


        // 김두희
        int i = 0;
        int totalSum, oddSum, evenSum;

        for (i = 1, totalSum = 0, oddSum = 0, evenSum = 0; i <= 100; i++) {
            totalSum += i;
            oddSum += (i % 2) * i;
            evenSum += (1 - i % 2) * i;
        }
        System.out.println("전체 합: " + totalSum);
        System.out.println("홀수 합: " + oddSum);
        System.out.println("짝수 합: " + evenSum);

        // 김병호
        sum = 0;
        // 1 ~ 100 합계
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100까지의 합: " + sum);

        // 1 ~ 100중 홀수들의 합계
        sum = 0;
        for (i = 0; i < 100; i++) {
            sum += ++i;
        }
        System.out.println("1 ~ 100 중 홀수들의 합: " + sum);

        // 1 ~ 100중 짝수들의 합계
        sum = 0;
        for (i = 1; i<= 100; i++) {
            sum += ++i;
        }
        System.out.println("1 ~ 100중 짝수들의 합: " + sum);

        // 김남규
        int sum1 = 0;
        int sum2 = 0;
        for(i = 1; i <= 100; i++) {
            // 1~100 전체 합 : sum1
            sum1 += i;
            // 1~100 중 짝수의 합 : sum2
            if(i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum1);
        // 1~100 전체 합에서 짝수의 합을 빼면 홀수의 합
        System.out.println(sum1 - sum2);
        System.out.println(sum2);

        // 한나라
        sum = 0;
        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        //1~100 짝수 합계
        sum2 = 0;
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                sum2 += x;
            }
        }
        System.out.println(sum2);

        //1~100 홀수 합계
        int sum3 = 0;
        for (int y = 0; y <= 100; y++) {
            if (y % 2 == 1) {
                sum3 += y;
            }
        }
        System.out.println(sum3);
    }
}

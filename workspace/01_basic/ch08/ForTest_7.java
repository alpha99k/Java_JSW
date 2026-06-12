package ch08;

public class ForTest_7 {
    static void main(String[] args) {
        //continue를 이용한 홀수 합계
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("1~100 홀수 합계: " + sum);

        //1~100합계
        sum = 0;
        int num = 1;
        while (true){
            sum += num;     // 0,1,3
            num++;          // 1,2,3,4
            if (num > 100){
                break;
            }
        }
        System.out.println(sum);
    }
}

package ch07;

//  나이에 따른 입장료 할인율 계산하는 프로그램을 작성하세요
//  7세 이하 : 영유야 할인 100%
//  8 - 13세 : 어린이 50% 할인
//  14 - 19세 : 청소년 30% 할인
//  65세 이상 : 70% 할인

public class If_SwitchTest2 {
    static void main(String[] args) {
        int price = 20000; //   정상가
        double discountRate;
        int lastPrice;
        int age = 70;
        String discountType;

        switch (age){
            case 1,2,3,4,5,6,7 :
                discountType = "영유아 할인";
                discountRate = 1;
                break;
            case 8,9,10,11,12,13:
                discountType = "어린이 할인";
                discountRate = 0.5;
                break;
            case 14,15,16,17,18,19 :
                discountType = "청소년 할인";
                discountRate = 0.3;
                break;
            case 20,21,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64:
                discountType = "none";
                discountRate = 0;
                break;
            default:
                discountType = "경로 할인";
                discountRate = 0.7;
        }

        lastPrice = (int)(price - (price * discountRate));

        System.out.println(discountType + (int)(discountRate*100) + "%가 적용되어 요금은 " + lastPrice + "원 입니다.");

    }
}
